package com.cengiz.springbootpostgresexample.data.mapper.mappers;

import com.cengiz.springbootpostgresexample.data.dto.MaasDto;
import com.cengiz.springbootpostgresexample.data.entity.Maas;
import com.cengiz.springbootpostgresexample.data.mapper.mapperBase.CycleAvoidingMappingContext;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T15:12:17+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class MaasMapperImpl implements MaasMapper {

    @Override
    public MaasDto entityToDto(Maas entity, CycleAvoidingMappingContext cycleAvoidingMappingContext) {
        MaasDto target = cycleAvoidingMappingContext.getMappedInstance( entity, MaasDto.class );
        if ( target != null ) {
            return target;
        }

        if ( entity == null ) {
            return null;
        }

        MaasDto maasDto = new MaasDto();

        cycleAvoidingMappingContext.storeMappedInstance( entity, maasDto );

        maasDto.setId( entity.getId() );
        maasDto.setMaas( entity.getMaas() );
        maasDto.setKayitZamani( entity.getKayitZamani() );

        return maasDto;
    }

    @Override
    public Maas dtoToEntity(MaasDto dto, CycleAvoidingMappingContext cycleAvoidingMappingContext) {
        Maas target = cycleAvoidingMappingContext.getMappedInstance( dto, Maas.class );
        if ( target != null ) {
            return target;
        }

        if ( dto == null ) {
            return null;
        }

        Maas maas = new Maas();

        cycleAvoidingMappingContext.storeMappedInstance( dto, maas );

        maas.setId( dto.getId() );
        maas.setMaas( dto.getMaas() );
        maas.setKayitZamani( dto.getKayitZamani() );

        return maas;
    }

    @Override
    public void dtoToEntity(Maas e, MaasDto d) {
        if ( d == null ) {
            return;
        }

        e.setId( d.getId() );
        e.setMaas( d.getMaas() );
        e.setKayitZamani( d.getKayitZamani() );
    }
}
