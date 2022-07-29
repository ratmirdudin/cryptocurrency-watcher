package com.ratmirdudin.cryptocurrency_watcher.services;


import com.ratmirdudin.cryptocurrency_watcher.repositories.CryptoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CryptoCurrencyService {
    private final CryptoRepository cryptoRepository;
}
