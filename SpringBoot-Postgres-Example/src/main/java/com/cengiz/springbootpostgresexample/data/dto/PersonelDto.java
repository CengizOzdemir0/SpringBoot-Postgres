package com.cengiz.springbootpostgresexample.data.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonelDto extends BaseDto{


  private Long id;
  private String adi;
  private String soyadi;
  private LocalDateTime iseBaslangicZamani;
  private LocalDateTime kayitZamani;

}
