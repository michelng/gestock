package com.michelng.gestock.service.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class AdresseDto {
    private String adresse1;

    private String adresse2;

    private  String ville;

    private String codepostal;

    private String pays;
}
