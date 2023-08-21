package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.Article;
import com.michelng.gestock.model.Vente;
import com.michelng.gestock.model.enumeration.StatutVente;

import java.math.BigDecimal;

public class LigneVenteDto {
    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private BigDecimal montantRemise;

    private BigDecimal montantTotal;

    private BigDecimal taxe;

    private String commentaire;

    private StatutVente statutVente;

    private Vente vente;

    private Article article;
}
