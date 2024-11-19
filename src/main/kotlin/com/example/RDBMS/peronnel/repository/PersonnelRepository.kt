package com.example.RDBMS.peronnel.repository

import com.example.RDBMS.entity.Personnel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonnelRepository: JpaRepository<Personnel, Int> {
}