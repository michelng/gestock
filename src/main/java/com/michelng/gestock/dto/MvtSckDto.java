package com.michelng.gestock.dto;

import com.michelng.gestock.model.Article;
import com.michelng.gestock.model.enumeration.TypeMvt;

import java.math.BigDecimal;
import java.time.Instant;

public class MvtSckDto {
    private Instant dateMvnt;

    private BigDecimal quantite;

    private TypeMvt typeMvt;

    private Article article;
}
