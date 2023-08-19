package com.michelng.gestock.dto;

import com.michelng.gestock.model.Adresse;
import com.michelng.gestock.model.Employe;
import com.michelng.gestock.model.Magasin;
import com.michelng.gestock.model.enumeration.Statut;

import java.util.HashSet;
import java.util.Set;

public class EntrepriseDto {
    private String nom;

    private String raisonSociale;

    private String telephone1;

    private String telephone2;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String telephone;

    private String sitWeb;

    private Statut statut;

    private Set<Employe> employes = new HashSet<>();

    private Set<Magasin> magasins = new HashSet<>();
}
