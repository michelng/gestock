package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Client;
import com.michelng.gestock.service.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends EntityMapper<ClientDto, Client>{
}
