package com.ratmirdudin.cryptocurrency_watcher.repositories;

import com.ratmirdudin.cryptocurrency_watcher.entities.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, Long> {
}
