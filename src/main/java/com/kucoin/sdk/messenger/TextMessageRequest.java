package com.kucoin.sdk.messenger;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TextMessageRequest {

  String receptor;
  String text;
  Map<String, String> context;
}
