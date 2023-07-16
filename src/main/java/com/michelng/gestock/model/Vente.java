package com.michelng.gestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vente")
public class Vente extends AbstractEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "dateVente")
    private String dateVente;

    @Column(name = "commentaire")
    private String commentaire;
}
