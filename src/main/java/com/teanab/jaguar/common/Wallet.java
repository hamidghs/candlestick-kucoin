package com.teanab.jaguar.common;

import java.util.Optional;

public interface Wallet {

  PublicAddress getPublicAddress();

  String getPrivateKey();

  String getPublicKey();

  WalletType getWalletType();

  default Optional<Seed> getSeed() {
    return Optional.empty();
  }

  enum WalletType {
    SIMPLE_WALLET,
    HD_WALLET
  }
}
