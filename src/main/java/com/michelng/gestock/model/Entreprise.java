package com.michelng.gestock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.michelng.gestock.model.enumeration.Statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "raison_sociale")
    private String raisonSociale;

    @Column(name = "telephone_1")
    private String telephone1;

    @Column(name = "telephone_2")
    private String telephone2;

    @Column(name = "description")
    private String description;

    @Embedded
    private Adresse adresse;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "sitweb")
    private String sitWeb;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private Statut statut;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "entreprise")
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "ventes", "entreprise" }, allowSetters = true)
    private Set<Employe> employes = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "entreprise")
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "entreprise" }, allowSetters = true)
    private Set<Magasin> magasins = new HashSet<>();
}
