package com.example.RDBMS.entity

import com.example.RDBMS.peronnel.dto.PersonnelDto
import jakarta.persistence.*

@Entity
@Table(name = "personnel")
data class Personnel(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int = 0,
  val name: String,
  @Column(name = "type_id")
  val typeId: Int,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "type_id", insertable = false, updatable = false)
  val type: Type? = null,

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "course_personnel",
    joinColumns = [JoinColumn(name = "personnel_id")],
    inverseJoinColumns = [JoinColumn(name = "course_id")]
  )
  val course: Set<Course>? = emptySet(),

) {
  fun toPersonnelDto(): PersonnelDto {
    return PersonnelDto(
      id = id,
      name = name,
      type = type!!.toTypeDto(),
      course = course?.map { it.toCourseDto() }
    )
  }
}
