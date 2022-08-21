package com.kucoin.sdk.order;

public enum OrderSide {
  SELL,
  BUY;

  public OrderSide opposite() {
    return this == BUY ? SELL : BUY;
  }
}
