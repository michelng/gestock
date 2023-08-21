package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.CommandeFournisseur;
import com.michelng.gestock.service.dto.CommandeFournisseurDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommandeFournisseurMapper  extends EntityMapper<CommandeFournisseurDto, CommandeFournisseur> {
}
