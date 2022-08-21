package com.kucoin.sdk.teller;

import com.kucoin.sdk.common.AssetId;
import com.kucoin.sdk.common.Network;
import com.kucoin.sdk.common.PublicAddress;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class WithdrawRequest implements Serializable {

  AssetId assetId;
  Network network;
  Long withdrawId;
  Long userId;
  PublicAddress toAddress;
  BigDecimal amount;
  BigDecimal fee;

}
