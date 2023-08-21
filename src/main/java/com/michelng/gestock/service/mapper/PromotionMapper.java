package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Promotion;
import com.michelng.gestock.service.dto.PromotionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PromotionMapper extends EntityMapper<PromotionDto, Promotion>{
}
