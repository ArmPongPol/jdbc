package com.example.RDBMS.type.repository

import com.example.RDBMS.entity.Type
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TypeRepository: JpaRepository<Type, Int> {
}