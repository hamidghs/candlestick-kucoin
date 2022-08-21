package com.teanab.jaguar.teller;

public enum WithdrawAttemptStatus {
  PENDING,
  VERIFIED,
  SENT,
  CONFIRMED,
  USER_BLOCKED,
  INVALID,
  INSUFFICIENT_HOT_WALLET_BALANCE,
  BLOCKCHAIN_PROBLEM,
  TIMEOUT
}