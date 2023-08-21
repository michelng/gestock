package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.CommandeClient;
import com.michelng.gestock.service.dto.CommandeClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommandeClientMapper extends EntityMapper<CommandeClientDto, CommandeClient>{
}
