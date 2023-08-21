package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Employe;
import com.michelng.gestock.service.dto.EmployeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeMapper extends EntityMapper<EmployeDto, Employe>{
}
