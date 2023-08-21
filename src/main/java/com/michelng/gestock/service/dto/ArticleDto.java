package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.Categorie;
import com.michelng.gestock.model.Magasin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private Categorie categorie;

    private BigDecimal quantiteEnStock;

    private BigDecimal seuilDeReapprovisionnement;

    private Magasin magasin;

}
