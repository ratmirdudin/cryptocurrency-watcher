package com.ratmirdudin.cryptocurrency_watcher.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoinLoreCryptoCurrencyDto {
    private Long id;
    private String symbol;
    private String name;
    @JsonProperty("nameid")
    private String nameId;
    @JsonProperty("price_usd")
    private String priceUsd;
}
