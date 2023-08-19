package com.michelng.gestock.dto;

import com.michelng.gestock.model.Adresse;
import com.michelng.gestock.model.CommandeClient;
import com.michelng.gestock.model.Facture;
import com.michelng.gestock.model.enumeration.Statut;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientDto {
    private String nom;

    private String prenom;

    private String photo;

    private String telephone1;

    private String telephone2;

    private String email;

    private String description;

    private Adresse adresse;

    private String carteCredit;

    private Statut statut;

    private List<CommandeClient> commandeClients;

    private Set<Facture> factures = new HashSet<>();
}
