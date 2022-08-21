package com.kucoin.sdk.order;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OrderStatus {
    PENDING,
    OPEN,
    CANCELLED,
    PARTIALLY_DONE,
    DONE;

    private static final List<OrderStatus> userStatus = Stream.of(
        OrderStatus.values()
    ).collect(Collectors.toList());

    public static List<OrderStatus> getUserStatus() {
        return userStatus;
    }
}