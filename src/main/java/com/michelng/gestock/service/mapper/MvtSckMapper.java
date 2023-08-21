package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.MvtStck;
import com.michelng.gestock.service.dto.MvtSckDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MvtSckMapper extends EntityMapper<MvtSckDto, MvtStck>{
}
