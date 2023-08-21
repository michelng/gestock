package com.michelng.gestock.service.mapper;

import com.michelng.gestock.model.Article;
import com.michelng.gestock.service.dto.ArticleDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper extends EntityMapper<ArticleDto, Article> {
}
