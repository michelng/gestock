package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Discount;
import com.michelng.gestock.service.dto.DiscountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DiscountMapper extends EntityMapper<DiscountDto, Discount>{
}
