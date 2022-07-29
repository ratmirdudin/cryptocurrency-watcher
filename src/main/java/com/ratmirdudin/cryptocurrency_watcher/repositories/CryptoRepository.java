package com.ratmirdudin.cryptocurrency_watcher.repositories;

import com.ratmirdudin.cryptocurrency_watcher.entities.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoRepository extends JpaRepository<Crypto, Long> {
}
