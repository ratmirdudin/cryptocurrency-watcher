package com.ratmirdudin.cryptocurrency_watcher.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CryptoDto {
    private Long number;

    private String symbol;
}
