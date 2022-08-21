package com.teanab.jaguar.wallet;

import com.teanab.jaguar.common.AssetId;
import com.teanab.jaguar.common.Network;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SyncWalletRequest implements Serializable {

  AssetId assetId;

  Network network;

  boolean isHotWallet;

  String address;

  String tag;

  Long lastTxTime;
}