package com.michelng.gestock.dto;

import com.michelng.gestock.model.Fournisseur;
import com.michelng.gestock.model.LigneCommandeFournisseur;
import com.michelng.gestock.model.enumeration.StatutCmd;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public class CommandeFournisseurDto {
    private Instant dateCommande;

    private Instant dateLivraisonPrevue;

    private BigDecimal montantTotal;

    private String commentaire;

    private StatutCmd statutCmd;

    private Fournisseur fournisseur;

    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
