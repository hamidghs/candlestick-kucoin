package com.kucoin.sdk.common;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class AssetIdDeserializer extends StdDeserializer<AssetId> {

  public AssetIdDeserializer() {
    this(null);
  }

  protected AssetIdDeserializer(Class<?> vc) {
    super(vc);
  }

  @Override
  public AssetId deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException, JacksonException {

    return AssetId.of(jsonParser.getText());
  }
}
