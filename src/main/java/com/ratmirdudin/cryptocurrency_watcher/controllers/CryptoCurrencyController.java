package com.ratmirdudin.cryptocurrency_watcher.controllers;

import com.ratmirdudin.cryptocurrency_watcher.dto.CoinLoreCryptoDto;
import com.ratmirdudin.cryptocurrency_watcher.services.CryptoCurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping("/api/cryptocurrency")
@RequiredArgsConstructor
public class CryptoCurrencyController {

    private final RestTemplate restTemplate;
    private final CryptoCurrencyService cryptoCurrencyService;

    // https://api.coinlore.net/api/ticker/?id=90
    // https://api.coinlore.net/api/ticker/?id=80
    // https://api.coinlore.net/api/ticker/?id=48543
    @GetMapping("/{number}")
    public ResponseEntity<?> getCurrentCryptoCurrencyByNumber(@PathVariable Long number) {
        CoinLoreCryptoDto body = Objects.requireNonNull(restTemplate
                .getForEntity("https://api.coinlore.net/api/ticker/?id=" + number, CoinLoreCryptoDto[].class)
                .getBody())[0];
        return ResponseEntity.ok(body);
    }
}
