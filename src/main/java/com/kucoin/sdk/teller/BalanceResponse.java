package com.kucoin.sdk.teller;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BalanceResponse {

  Boolean success;
  BigDecimal balance;
  String error;

  public static BalanceResponse success(BigDecimal balance) {
    return new BalanceResponse(true, balance, null);
  }

  public static BalanceResponse error(String error) {
    return new BalanceResponse(false, BigDecimal.ZERO, error);
  }
}

