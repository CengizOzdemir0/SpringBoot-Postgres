package com.cengiz.springbootpostgresexample.service.impl;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cengiz.springbootpostgresexample.data.dto.PersonelDto;
import com.cengiz.springbootpostgresexample.data.entity.Personel;
import com.cengiz.springbootpostgresexample.data.mapper.mappers.PersonelMapper;
import com.cengiz.springbootpostgresexample.repository.PersonelRepository;
import com.cengiz.springbootpostgresexample.service.PersonelService;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonelServiceImpl implements PersonelService {

  private final PersonelRepository personelRepository;
  private final PersonelMapper personelMapper;

  @Override
  public PersonelDto findById(Long id){
    Optional<Personel> byId = personelRepository.findById(id);
    return byId.map(personelMapper::entityToDto).orElse(null);
  }


  @Override
  public PersonelDto save(PersonelDto personelDto){
    personelDto.setKayitZamani(LocalDateTime.now());
    personelDto.setIseBaslangicZamani(LocalDateTime.now());
    return personelMapper.entityToDto(personelRepository.save(personelMapper.dtoToEntity(personelDto)));
  }


}
