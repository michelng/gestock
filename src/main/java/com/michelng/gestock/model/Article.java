package com.michelng.gestock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @Column(name = "quantite_en_stock", precision = 21, scale = 2)
    private BigDecimal quantiteEnStock;

    @Column(name = "seuil_de_reapprovisionnement", precision = 21, scale = 2)
    private BigDecimal seuilDeReapprovisionnement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idMagasin")
    private Magasin magasin;

//    @OneToMany(mappedBy = "article")
//    private List<LigneCommandeClient> ligneCommandeClient;
//
//    @OneToMany(mappedBy = "article")
//    private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
}
