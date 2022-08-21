package com.kucoin.sdk.deposit;

import com.kucoin.sdk.common.Network;
import com.kucoin.sdk.common.PublicAddress;
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
public class NodeDepositRequest implements Serializable {

  private Network network;
  private String contractAddress;
  private String txHash;
  private String txLink;
  private List<PublicAddress> srcAddresses;
  private String destAddress;
  private String destTag;
  private BigDecimal amount;
  private Long time;

}
