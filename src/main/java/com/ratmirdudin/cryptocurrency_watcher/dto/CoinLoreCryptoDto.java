package com.ratmirdudin.cryptocurrency_watcher.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoinLoreCryptoDto {
    private Long id;
    private String symbol;
    private String name;
    @JsonProperty("nameid")
    private String nameId;
    //    private String rank;
    @JsonProperty("price_usd")
    private String priceUsd;
//    private String percent_change_24h;
//    private String percent_change_1h;
//    private String percent_change_7d;
//    private String market_cap_usd;
//    private String volume24;
//    private String volume24_native;
//    private String csupply;
//    private String price_btc;
//    private String tsupply;
//    private String msupply;
}
