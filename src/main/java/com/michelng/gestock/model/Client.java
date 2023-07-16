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
@Table(name = "client")
public class Client extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "photo")
    private String photo;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
