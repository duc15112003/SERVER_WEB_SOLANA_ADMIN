package com.solana.main.mapper;

import com.solana.main.dto.IdeaCategoryDTO;
import com.solana.main.model.IdeaCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IdeaCategoryMapper {
    IdeaCategoryMapper INSTANCE = Mappers.getMapper( IdeaCategoryMapper.class );
    
    IdeaCategoryDTO IdeaCategoryToIdeaCategoryDTO(IdeaCategory IdeaCategory);
    IdeaCategory IdeaCategoryDTOToIdeaCategory(IdeaCategoryDTO IdeaCategoryDto);
    List<IdeaCategory> listIdeaCategoryDTOToListIdeaCategory(List<IdeaCategoryDTO> listIdeaCategoryDTO);
    List<IdeaCategoryDTO> listIdeaCategoryToListIdeaCategoryDTO(List<IdeaCategory> listIdeaCategory);
}
