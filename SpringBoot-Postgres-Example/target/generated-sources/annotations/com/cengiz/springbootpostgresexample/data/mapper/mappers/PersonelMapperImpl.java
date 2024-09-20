package com.cengiz.springbootpostgresexample.data.mapper.mappers;

import com.cengiz.springbootpostgresexample.data.dto.PersonelDto;
import com.cengiz.springbootpostgresexample.data.entity.Personel;
import com.cengiz.springbootpostgresexample.data.mapper.mapperBase.CycleAvoidingMappingContext;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T15:12:18+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class PersonelMapperImpl implements PersonelMapper {

    @Override
    public PersonelDto entityToDto(Personel entity, CycleAvoidingMappingContext cycleAvoidingMappingContext) {
        PersonelDto target = cycleAvoidingMappingContext.getMappedInstance( entity, PersonelDto.class );
        if ( target != null ) {
            return target;
        }

        if ( entity == null ) {
            return null;
        }

        PersonelDto personelDto = new PersonelDto();

        cycleAvoidingMappingContext.storeMappedInstance( entity, personelDto );

        personelDto.setId( entity.getId() );
        personelDto.setAdi( entity.getAdi() );
        personelDto.setSoyadi( entity.getSoyadi() );
        personelDto.setIseBaslangicZamani( entity.getIseBaslangicZamani() );
        personelDto.setKayitZamani( entity.getKayitZamani() );

        return personelDto;
    }

    @Override
    public Personel dtoToEntity(PersonelDto dto, CycleAvoidingMappingContext cycleAvoidingMappingContext) {
        Personel target = cycleAvoidingMappingContext.getMappedInstance( dto, Personel.class );
        if ( target != null ) {
            return target;
        }

        if ( dto == null ) {
            return null;
        }

        Personel personel = new Personel();

        cycleAvoidingMappingContext.storeMappedInstance( dto, personel );

        personel.setId( dto.getId() );
        personel.setAdi( dto.getAdi() );
        personel.setSoyadi( dto.getSoyadi() );
        personel.setIseBaslangicZamani( dto.getIseBaslangicZamani() );
        personel.setKayitZamani( dto.getKayitZamani() );

        return personel;
    }

    @Override
    public void dtoToEntity(Personel e, PersonelDto d) {
        if ( d == null ) {
            return;
        }

        e.setId( d.getId() );
        e.setAdi( d.getAdi() );
        e.setSoyadi( d.getSoyadi() );
        e.setIseBaslangicZamani( d.getIseBaslangicZamani() );
        e.setKayitZamani( d.getKayitZamani() );
    }
}
