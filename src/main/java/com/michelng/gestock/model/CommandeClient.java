package com.michelng.gestock.model;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.ListAttribute;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity{

    @Column(name="code")
    private String code;

    @Column(name="datecommande")
    private Instant dateCommande;

    @ManyToOne()
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(mappedBy ="commandeClient" )
    private List<LigneCommandeClient> ligneCommandeClients;
}
