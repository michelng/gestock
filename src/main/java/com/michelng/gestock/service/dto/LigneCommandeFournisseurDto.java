package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.Article;
import com.michelng.gestock.model.CommandeFournisseur;
import com.michelng.gestock.model.enumeration.StatutCmd;

import java.math.BigDecimal;
import java.time.Instant;

public class LigneCommandeFournisseurDto {
    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Instant dateLivraisonPrevu;

    private BigDecimal montantTotal;

    private String commentaire;

    private StatutCmd statutCmd;

    private CommandeFournisseur commandeFournisseur;

    private Article article;
}
