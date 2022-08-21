package com.teanab.jaguar.teller;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawResponse implements Serializable {

  Long withdrawalId;

  WithdrawAttemptStatus status;

  String transactionId;

  String transactionLink;

  BigDecimal transactionFee;

  boolean isInternal = false;

}
