package com.teanab.jaguar.common;


import java.util.HashMap;
import java.util.Map;

public enum ExchangeName {
    KUCOIN("KUCOIN"),
    BINANCE("BINANCE"),
    TEST("TEST")
    ;

    private static final Map<String, ExchangeName> lookup = new HashMap();

    private String value;
    ExchangeName(String value) {
        this.value = value;
    }

    static {
        //Create reverse lookup hash map
        for (ExchangeName exchangeName : ExchangeName.values())
            lookup.put(exchangeName.getValue(), exchangeName);
    }

    public static ExchangeName get(String exchangeNameValue) {
        //the reverse lookup by simply getting
        //the value from the lookup HsahMap.
        return lookup.get(exchangeNameValue);
    }

    public String getValue() {
        return value;
    }

}
