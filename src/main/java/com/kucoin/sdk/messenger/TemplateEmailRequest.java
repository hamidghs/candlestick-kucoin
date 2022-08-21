package com.kucoin.sdk.messenger;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TemplateEmailRequest implements EmailRequest {

  String language;
  String toEmail;
  String subject;
  String templateFile;
  Map<String, String> data;
}
