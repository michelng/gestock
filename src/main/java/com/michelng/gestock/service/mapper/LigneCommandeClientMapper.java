package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.LigneCommandeClient;
import com.michelng.gestock.service.dto.LigneCommandeClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LigneCommandeClientMapper extends EntityMapper<LigneCommandeClientDto, LigneCommandeClient>{
}
