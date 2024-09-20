package com.cengiz.springbootpostgresexample.data.mapper.mappers;

import org.mapstruct.Mapper;

import com.cengiz.springbootpostgresexample.data.dto.PersonelDto;
import com.cengiz.springbootpostgresexample.data.entity.Personel;
import com.cengiz.springbootpostgresexample.data.mapper.mapperBase.MapperBase;


@Mapper
public interface PersonelMapper extends MapperBase<Personel, PersonelDto> {

}
