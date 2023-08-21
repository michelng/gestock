package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.Client;
import com.michelng.gestock.model.Employe;
import com.michelng.gestock.model.enumeration.StatutPaiement;

import java.math.BigDecimal;
import java.time.Instant;

public class VenteDto {
    private String code;

    private Instant dateVente;

    private String commentaire;

    private BigDecimal montantTotal;

    private StatutPaiement statutPaiement;

    private Client client;

    private Employe employe;
}
