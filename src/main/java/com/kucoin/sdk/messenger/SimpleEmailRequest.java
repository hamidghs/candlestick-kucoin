package com.kucoin.sdk.messenger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleEmailRequest implements EmailRequest {

  String toEmail;
  String subject;
  String body;
}
