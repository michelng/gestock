package com.michelng.gestock.model;

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

    @Column(name = "datemvt")
    private Instant dateMvt;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "typemvt")
    private TypeMvt typeMvt;
}
