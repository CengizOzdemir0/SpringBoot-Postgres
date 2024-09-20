package com.cengiz.springbootpostgresexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cengiz.springbootpostgresexample.data.entity.Personel;




public interface PersonelRepository extends JpaRepository<Personel,Long> {

}
