package com.example.RDBMS.peronnel.service.impl

import com.example.RDBMS.entity.CoursePersonnel
import com.example.RDBMS.peronnel.dto.PersonnelDto
import com.example.RDBMS.peronnel.repository.CoursePersonnelRepository
import com.example.RDBMS.peronnel.repository.PersonnelRepository
import com.example.RDBMS.peronnel.request.CoursePersonnelRequest
import com.example.RDBMS.peronnel.service.PersonnelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service

@Service
class PersonnelServiceImpl @Autowired constructor(
  private val personnelRepository: PersonnelRepository,
  private val coursePersonnelRepository: CoursePersonnelRepository,
  private val courseRepository: PersonnelRepository,
) : PersonnelService {
  override fun getListPersonnel(): List<PersonnelDto> {
    val query = personnelRepository.findAll()

    return query.map { personnel ->
      PersonnelDto(
        personnel.id,
        personnel.name,
        personnel.type!!.toTypeDto(),
        personnel.course?.map { it.toCourseDto() }
      )
    }
  }

  override fun enrollCourse(request: CoursePersonnelRequest): Boolean {
    personnelRepository.findById(request.personnelId).orElseThrow {
      throw NotFoundException()
    }

    courseRepository.findById(request.courseId).orElseThrow {
      throw NotFoundException()
    }

    coursePersonnelRepository.save(
      CoursePersonnel(
        courseId = request.courseId,
        personnelId = request.personnelId
      )
    )

    return true
  }

}