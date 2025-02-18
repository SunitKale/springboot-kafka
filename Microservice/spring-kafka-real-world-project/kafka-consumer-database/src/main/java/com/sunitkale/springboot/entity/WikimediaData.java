package com.sunitkale.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "wikimedia_recentchange")
@Data
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikiEventData;
}
