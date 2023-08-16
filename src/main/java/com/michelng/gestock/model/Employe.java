package com.michelng.gestock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.michelng.gestock.model.enumeration.StatutEmploi;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employe")
public class Employe extends AbstractEntity{

    @Column(name = "identifiant")
    private String identifiant;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private  String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone_1")
    private String telephone1;

    @Column(name = "telephone_2")
    private String telephone2;

    @Column(name = "dateDenaissance")
    private Instant dateDenaissance;

    @Column(name = "date_embauche")
    private Instant dateEmbauche;

    @Column(name = "salaire", precision = 21, scale = 2)
    private BigDecimal salaire;

    @Column(name = "motDePasse")
    private String motDePasse;

    @Column(name = "fonction")
    private String fonction;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_emploi")
    private StatutEmploi statutEmploi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "employes", "magasins" }, allowSetters = true)
    private Entreprise entreprise;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employe")
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "client", "employe" }, allowSetters = true)
    private Set<Vente> ventes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "idmagasin")
    private Magasin magasin;

    @OneToMany(mappedBy = "employe")
    private List<Role> roles;
}
