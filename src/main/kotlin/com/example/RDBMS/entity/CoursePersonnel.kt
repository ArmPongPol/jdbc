package com.example.RDBMS.entity

import jakarta.persistence.*

@Entity
@Table(name = "course_personnel")
data class CoursePersonnel(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int = 0,
  @Column(name = "course_id")
  val courseId: Int,
  @Column(name = "personnel_id")
  val personnelId: Int,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "course_id", insertable = false, updatable = false)
  val course: Course? = null,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "personnel_id", insertable = false, updatable = false)
  val personnel: Personnel? = null,
)
