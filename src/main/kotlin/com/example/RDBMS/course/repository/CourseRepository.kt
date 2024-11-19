package com.example.RDBMS.course.repository

import com.example.RDBMS.entity.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository: JpaRepository<Course, Int> {
}