package com.michelng.gestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "magasin")
public class Magasin extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

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

    @OneToMany(mappedBy = "magasin")
    private List<Utilisateur> utilisateurs;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;



}
