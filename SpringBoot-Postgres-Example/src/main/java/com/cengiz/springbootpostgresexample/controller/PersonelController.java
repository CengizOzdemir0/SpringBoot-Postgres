package com.cengiz.springbootpostgresexample.controller;


import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cengiz.springbootpostgresexample.data.dto.PersonelDto;
import com.cengiz.springbootpostgresexample.service.PersonelService;

@RestController
@RequestMapping("/personel")
@RequiredArgsConstructor
public class PersonelController {

  private final PersonelService personelService;


  @GetMapping("/{id}")
  public ResponseEntity<PersonelDto> getById(@PathVariable(value = "id") Long id) {
      return ResponseEntity.ok(personelService.findById(id));
  }

  @PostMapping
  public ResponseEntity<PersonelDto> save(@RequestBody PersonelDto personelDto) {
    return ResponseEntity.ok(personelService.save(personelDto));
  }


}