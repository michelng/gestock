package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.Article;
import com.michelng.gestock.model.CommandeClient;
import com.michelng.gestock.model.enumeration.StatutCmd;

import java.math.BigDecimal;
import java.time.Instant;

public class LigneCommandeClientDto {
    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Instant dateLivraisonPrevue;

    private BigDecimal montantTotal;

    private String commentaire;

    private StatutCmd statutCmd;

    private Article article;

    private CommandeClient commandeClient;
}
