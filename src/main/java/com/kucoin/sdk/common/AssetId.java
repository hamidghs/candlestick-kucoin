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
@JsonSerialize(using = AssetIdSerializer.class)
@JsonDeserialize(using = AssetIdDeserializer.class)
public class AssetId implements Serializable {

  private String symbol;

  public static AssetId of(String symbol) {
    return new AssetId(symbol);
  }

  @Override
  public String toString() {
    return symbol;
  }
}
