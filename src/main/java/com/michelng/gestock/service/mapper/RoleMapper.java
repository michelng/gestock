package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Role;
import com.michelng.gestock.service.dto.RoleDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends EntityMapper<RoleDto, Role>{
}
