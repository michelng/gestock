package com.michelng.gestock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvtstck")
public class MvtStck  extends AbstractEntity{

    @Column(name = "date_mvnt")
    private Instant dateMvnt;

    @Column(name = "quantite", precision = 21, scale = 2)
    private BigDecimal quantite;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_mvt")
    private TypeMvt typeMvt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "magasin", "categorie" }, allowSetters = true)
    private Article article;
}
