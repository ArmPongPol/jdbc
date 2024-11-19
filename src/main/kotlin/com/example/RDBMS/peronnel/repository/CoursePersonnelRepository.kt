package com.example.RDBMS.peronnel.repository

import com.example.RDBMS.entity.CoursePersonnel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoursePersonnelRepository: JpaRepository<CoursePersonnel, Int> {
}