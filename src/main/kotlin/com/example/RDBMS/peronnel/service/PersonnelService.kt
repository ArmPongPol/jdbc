package com.example.RDBMS.peronnel.service

import com.example.RDBMS.peronnel.dto.PersonnelDto
import com.example.RDBMS.peronnel.request.CoursePersonnelRequest

interface PersonnelService {
  fun getListPersonnel(): List<PersonnelDto>
  fun enrollCourse(request: CoursePersonnelRequest): Boolean
}