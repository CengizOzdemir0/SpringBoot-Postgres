package com.cengiz.springbootpostgresexample.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.cengiz.springbootpostgresexample.data.dto.BaseDto;


@Getter
@Setter
@Entity
@Table(name = "personel", schema = "personel")
public class Personel extends BaseDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "adi")
  private String adi;

  @Column(name = "soyadi")
  private String soyadi;

  @Column(name = "ise_baslangic_zamani")
  private LocalDateTime iseBaslangicZamani;

  @Column(name = "kayit_zamani")
  private LocalDateTime kayitZamani;
}
