package com.cengiz.springbootpostgresexample.service;

import java.util.List;

import com.cengiz.springbootpostgresexample.data.dto.PersonelDto;
import com.cengiz.springbootpostgresexample.data.entity.Personel;

public interface PersonelService {

  PersonelDto findById(Long id);



  PersonelDto save(PersonelDto personelDto);
}
