package com.teanab.jaguar.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class AssetIdSerializer extends StdSerializer<AssetId> {

  public AssetIdSerializer() {
    this(null);
  }

  protected AssetIdSerializer(Class<AssetId> t) {
    super(t);
  }

  @Override
  public void serialize(AssetId assetId, JsonGenerator jsonGenerator,
      SerializerProvider serializerProvider) throws IOException {

    jsonGenerator.writeString(assetId.getSymbol());

  }
}
