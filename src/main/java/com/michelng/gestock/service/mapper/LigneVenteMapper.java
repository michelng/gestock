package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.LigneVente;
import com.michelng.gestock.service.dto.LigneVenteDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LigneVenteMapper extends EntityMapper<LigneVenteDto, LigneVente>{
}
