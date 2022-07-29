package com.ratmirdudin.cryptocurrency_watcher;

import com.ratmirdudin.cryptocurrency_watcher.entities.Crypto;
import com.ratmirdudin.cryptocurrency_watcher.repositories.CryptoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.List;

@SpringBootApplication
@Configuration
@RequiredArgsConstructor
public class CryptocurrencyWatcherApplication implements CommandLineRunner {

    private final CryptoRepository cryptoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CryptocurrencyWatcherApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(60000))
                .setReadTimeout(Duration.ofMillis(60000))
                .build();
    }

    @Override
    public void run(String... args) throws Exception {
        cryptoRepository.saveAll(List.of(
                Crypto.builder().number(80L).symbol("ETH").build(),
                Crypto.builder().number(90L).symbol("BTC").build(),
                Crypto.builder().number(48543L).symbol("SOL").build()
        ));
    }
}
