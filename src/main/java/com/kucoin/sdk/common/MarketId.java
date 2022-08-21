package com.kucoin.sdk.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@JsonSerialize(using = MarketIdSerializer.class)
@JsonDeserialize(using = MarketIdDeserializer.class)
public class MarketId implements Serializable {

  private String symbol;

  public static MarketId of(String symbol) {
    return new MarketId(symbol);
  }

  @Override
  public String toString() {
    return symbol;
  }

  // todo : this field better to move to db
  public boolean isStableMarket() {
    return this.equals(MarketId.of("USDT_IRT")) || this.equals(MarketId.of("DAI_IRT"));
  }

  public AssetId getBaseAssetId() {
    return AssetId.of(this.toString().split("_", 2)[0]);
  }

  public AssetId getQuoteAssetId() {
    return AssetId.of(this.toString().split("_", 2)[1]);
  }

  public static MarketId fromCurrency(String base, String quote) {
    return MarketId.of(base + "_" + quote);
  }

  public static MarketId fromAssetId(AssetId base, AssetId quote) {
    return MarketId.of(base.getSymbol() + "_" + quote.getSymbol());
  }
}
