package com.michelng.gestock.dto;

import com.michelng.gestock.model.Client;
import com.michelng.gestock.model.LigneCommandeClient;
import com.michelng.gestock.model.enumeration.StatutCmd;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public class CommandeClientDto {
    private String code;

    private Instant dateCommande;

    private Instant dateLivraisonPrevue;

    private BigDecimal montantTotal;

    private String commentaire;

    private StatutCmd statutCmd;

    private Client client;

    private List<LigneCommandeClient> ligneCommandeClients;
}
