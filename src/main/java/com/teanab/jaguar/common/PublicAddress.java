package com.teanab.jaguar.common;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PublicAddress {

  private String address;
  private String addressTag;

  public PublicAddress(String address) {
    this.address = address;
  }
}
