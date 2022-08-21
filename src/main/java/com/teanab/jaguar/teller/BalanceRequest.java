package com.teanab.jaguar.teller;

import com.teanab.jaguar.common.AssetId;
import com.teanab.jaguar.common.Network;
import com.teanab.jaguar.common.PublicAddress;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BalanceRequest implements Serializable {

  AssetId assetId;
  Network network;
  PublicAddress address;

}
