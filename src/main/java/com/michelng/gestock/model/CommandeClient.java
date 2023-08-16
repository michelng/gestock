package com.michelng.gestock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.michelng.gestock.model.enumeration.StatutCmd;
import jakarta.persistence.*;
import jakarta.persistence.metamodel.ListAttribute;
import lombok.*;

import java.math.BigDecimal;
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

    @Column(name = "code")
    private String code;

    @Column(name = "date_commande")
    private Instant dateCommande;

    @Column(name = "date_livraison_prevue")
    private Instant dateLivraisonPrevue;

    @Column(name = "montant_total", precision = 21, scale = 2)
    private BigDecimal montantTotal;

    @Column(name = "commentaire")
    private String commentaire;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_cmd")
    private StatutCmd statutCmd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "factures" }, allowSetters = true)
    private Client client;

    @OneToMany(mappedBy ="commandeClient" )
    private List<LigneCommandeClient> ligneCommandeClients;
}
