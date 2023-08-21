package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Entreprise;
import com.michelng.gestock.service.dto.EntrepriseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntrepriseMapper extends EntityMapper<EntrepriseDto, Entreprise> {
}
