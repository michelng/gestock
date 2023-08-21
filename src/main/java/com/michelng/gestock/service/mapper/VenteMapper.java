package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Vente;
import com.michelng.gestock.service.dto.VenteDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VenteMapper extends EntityMapper<VenteDto, Vente>{
}
