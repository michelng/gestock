package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.Client;
import com.michelng.gestock.model.Vente;
import com.michelng.gestock.model.enumeration.StatutPaiement;

import java.math.BigDecimal;
import java.time.Instant;

public class FactureDto {
    private String numero;

    private Instant dateFacture;

    private Instant dateEcheance;

    private BigDecimal montantTotal;

    private String commentaire;

    private StatutPaiement statutPaiement;

    private Vente vente;

    private Client client;
}
