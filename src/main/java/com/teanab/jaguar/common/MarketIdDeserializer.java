package com.teanab.jaguar.common;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class MarketIdDeserializer extends StdDeserializer<MarketId> {

  public MarketIdDeserializer() {
    this(null);
  }

  protected MarketIdDeserializer(Class<MarketId> t) {
    super(t);
  }

  @Override
  public MarketId deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException, JacksonException {

    return MarketId.of(jsonParser.getText());
  }
}
