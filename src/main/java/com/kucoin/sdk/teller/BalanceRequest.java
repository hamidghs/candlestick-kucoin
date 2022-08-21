package com.kucoin.sdk.teller;

import com.kucoin.sdk.common.AssetId;
import com.kucoin.sdk.common.Network;
import com.kucoin.sdk.common.PublicAddress;
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
