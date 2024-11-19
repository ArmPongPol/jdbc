package com.example.RDBMS.peronnel.controller

import com.example.RDBMS.peronnel.dto.PersonnelDto
import com.example.RDBMS.peronnel.service.PersonnelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/personnel")
class PersonnelController @Autowired constructor(
  private val personnelService: PersonnelService
) {
  @GetMapping
  fun getListPersonnel(): List<PersonnelDto> {
    return personnelService.getListPersonnel()
  }
}