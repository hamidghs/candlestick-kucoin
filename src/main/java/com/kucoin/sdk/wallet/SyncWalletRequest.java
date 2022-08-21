package com.kucoin.sdk.wallet;

import com.kucoin.sdk.common.AssetId;
import com.kucoin.sdk.common.Network;
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