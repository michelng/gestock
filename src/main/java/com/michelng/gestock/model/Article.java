package com.michelng.gestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt;

    @Column(name = "tauxtva")
    private BigDecimal tauxTva;

    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    private Categorie categorie;

//    @OneToMany(mappedBy = "article")
//    private List<LigneCommandeClient> ligneCommandeClient;
//
//    @OneToMany(mappedBy = "article")
//    private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
}
