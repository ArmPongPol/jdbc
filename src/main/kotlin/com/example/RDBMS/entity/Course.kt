package com.example.RDBMS.entity

import com.example.RDBMS.course.dto.CourseDto
import jakarta.persistence.*

@Entity
@Table(name = "course")
data class Course(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int,
  val name: String
) {
  fun toCourseDto(): CourseDto {
    return CourseDto(
      id = id,
      name = name
    )
  }
}
