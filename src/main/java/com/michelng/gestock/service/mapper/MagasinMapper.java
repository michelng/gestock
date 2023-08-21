package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Magasin;
import com.michelng.gestock.service.dto.MagasinDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MagasinMapper extends EntityMapper<MagasinDto, Magasin>{
}
