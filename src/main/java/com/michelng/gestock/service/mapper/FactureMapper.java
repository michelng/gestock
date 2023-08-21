package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Facture;
import com.michelng.gestock.service.dto.FactureDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FactureMapper extends EntityMapper<FactureDto, Facture> {
}
