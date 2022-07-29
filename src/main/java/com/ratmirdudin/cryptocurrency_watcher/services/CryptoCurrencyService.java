package com.ratmirdudin.cryptocurrency_watcher.services;


import com.ratmirdudin.cryptocurrency_watcher.dto.CryptoDto;
import com.ratmirdudin.cryptocurrency_watcher.entities.Crypto;
import com.ratmirdudin.cryptocurrency_watcher.repositories.CryptoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CryptoCurrencyService {
    private final CryptoRepository cryptoRepository;


    private CryptoDto mapToDto(Crypto crypto) {
        return CryptoDto.builder()
                .number(crypto.getNumber())
                .symbol(crypto.getSymbol())
                .build();
    }

    public List<CryptoDto> getAllAvailableCryptos() {
        return cryptoRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }
}
