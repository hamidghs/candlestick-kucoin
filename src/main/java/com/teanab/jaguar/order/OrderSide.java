package com.teanab.jaguar.order;

public enum OrderSide {
  SELL,
  BUY;

  public OrderSide opposite() {
    return this == BUY ? SELL : BUY;
  }
}
