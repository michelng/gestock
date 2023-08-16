package com.michelng.gestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "discount")
public class Discount extends AbstractEntity{
    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "montant", precision = 21, scale = 2)
    private BigDecimal montant;
}
