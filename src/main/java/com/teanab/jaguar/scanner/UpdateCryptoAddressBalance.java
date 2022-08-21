package com.teanab.jaguar.scanner;

import com.teanab.jaguar.common.Network;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class UpdateCryptoAddressBalance implements Serializable {

  Network network;
  String asset;
  String contractAddress;
  String address;
  String addressTag;
  BigDecimal balance;
}
