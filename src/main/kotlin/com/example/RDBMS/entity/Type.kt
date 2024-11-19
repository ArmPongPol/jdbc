package com.example.RDBMS.entity

import com.example.RDBMS.type.dto.TypeDto
import jakarta.persistence.*

@Entity
@Table(name = "type")
data class Type(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int = 0,
  val name: String,
) {
  fun toTypeDto(): TypeDto {
    return TypeDto(
      id = id,
      name = name
    )
  }
}