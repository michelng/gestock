package com.michelng.gestock.dto;

import com.michelng.gestock.model.*;
import com.michelng.gestock.model.enumeration.StatutEmploi;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeDto {
    private String identifiant;

    private String nom;

    private  String prenom;

    private String email;

    private String telephone1;

    private String telephone2;

    private Instant dateDenaissance;

    private Instant dateEmbauche;

    private BigDecimal salaire;

    private String motDePasse;

    private String fonction;

    private Adresse adresse;

    private String photo;

    private StatutEmploi statutEmploi;

    private Entreprise entreprise;

    private Set<Vente> ventes = new HashSet<>();

    private Magasin magasin;

    private List<Role> roles;
}
