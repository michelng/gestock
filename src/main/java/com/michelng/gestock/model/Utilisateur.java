package com.michelng.gestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private  String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "dateDenaissance")
    private Instant dateDenaissance;

    @Column(name = "motDePasse")
    private String motDePasse;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "entreprise")
    private Entreprise entreprise;

    @ManyToOne
    @JoinColumn(name = "idmagasin")
    private Magasin magasin;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;
}
