package com.ratmirdudin.cryptocurrency_watcher.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "crypto_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Crypto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long number;

    private String symbol;
}
