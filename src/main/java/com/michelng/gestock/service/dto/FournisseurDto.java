package com.michelng.gestock.service.dto;

import com.michelng.gestock.model.CommandeFournisseur;
import com.michelng.gestock.model.enumeration.Statut;

import java.util.List;

public class FournisseurDto {
    private String nomResponsable;

    private String raisonSociale;

    private String telephone1;

    private String telephone2;

    private String email;

    private String logo;

    private String description;

    private Statut statut;

    private List<CommandeFournisseur> commandeFournisseurs;
}
