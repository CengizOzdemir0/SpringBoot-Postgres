package com.cengiz.springbootpostgresexample.data.mapper.mappers;

import org.mapstruct.Mapper;

import com.cengiz.springbootpostgresexample.data.dto.MaasDto;
import com.cengiz.springbootpostgresexample.data.entity.Maas;
import com.cengiz.springbootpostgresexample.data.mapper.mapperBase.MapperBase;

@Mapper
public interface MaasMapper extends MapperBase<Maas, MaasDto> {

}
