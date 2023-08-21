package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Fournisseur;
import com.michelng.gestock.service.dto.FournisseurDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FournisseurMapper extends EntityMapper<FournisseurDto, Fournisseur> {
}
