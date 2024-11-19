package com.example.RDBMS.peronnel.dto

import com.example.RDBMS.course.dto.CourseDto
import com.example.RDBMS.type.dto.TypeDto

data class PersonnelDto(
  val id: Int,
  val name: String,
  val type: TypeDto,
  val course: List<CourseDto>? = null,
)
