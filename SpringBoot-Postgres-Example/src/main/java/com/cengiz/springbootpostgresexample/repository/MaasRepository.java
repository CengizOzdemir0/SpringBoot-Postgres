package com.cengiz.springbootpostgresexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cengiz.springbootpostgresexample.data.entity.Maas;

public interface MaasRepository extends JpaRepository<Maas,Long> {

}
