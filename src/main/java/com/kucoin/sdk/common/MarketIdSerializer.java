package com.kucoin.sdk.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class MarketIdSerializer extends StdSerializer<MarketId> {

  public MarketIdSerializer() {
    this(null);
  }

  protected MarketIdSerializer(Class<MarketId> t) {
    super(t);
  }

  @Override
  public void serialize(MarketId marketId, JsonGenerator jsonGenerator,
      SerializerProvider serializerProvider) throws IOException {

    jsonGenerator.writeString(marketId.getSymbol());

  }
}
