package com.teanab.jaguar.deposit;

import com.teanab.jaguar.common.AssetId;
import com.teanab.jaguar.common.Network;
import com.teanab.jaguar.common.PublicAddress;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DepositRequest implements Serializable {

  AssetId assetId;

  Network network;

  List<PublicAddress> fromAddresses;
  PublicAddress toAddress;

  BigDecimal amount;
  BigDecimal fee;

  Long time;

  String transactionId;

  String txLink;

  Boolean isInternal = false;

  Boolean isHotDeposit = false;

}
