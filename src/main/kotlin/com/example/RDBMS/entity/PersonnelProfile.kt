package com.example.RDBMS.entity

import jakarta.persistence.*

@Entity
@Table(name = "personnel_profile")
data class PersonnelProfile(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int,
  val email: String,
  val address: String,
  val phoneNumber: String,
  @Column(name = "personnel_id")
  val personnelId: Int,

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "personnel_id", insertable = false, updatable = false)
  val personnel: Personnel? = null,
)
