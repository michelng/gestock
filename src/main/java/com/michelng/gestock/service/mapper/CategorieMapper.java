package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Categorie;
import com.michelng.gestock.service.dto.CategorieDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper extends EntityMapper<CategorieDto, Categorie>{
}
