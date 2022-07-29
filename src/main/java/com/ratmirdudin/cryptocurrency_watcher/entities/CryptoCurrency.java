package com.ratmirdudin.cryptocurrency_watcher.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CryptoCurrency {

    @Id
    @GeneratedValue(generator = GenerationType.IDENTITY)
    private Long id;
}
