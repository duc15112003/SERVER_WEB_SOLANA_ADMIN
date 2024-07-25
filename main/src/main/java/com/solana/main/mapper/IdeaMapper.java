package com.solana.main.mapper;

import com.solana.main.dto.IdeaDTO;
import com.solana.main.model.Idea;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IdeaMapper {
    IdeaMapper INSTANCE = Mappers.getMapper( IdeaMapper.class );

    IdeaDTO IdeaToIdeaDTO(Idea Idea);
    Idea IdeaDTOToIdea(IdeaDTO IdeaDto);
    List<Idea> listIdeaDTOToListIdea(List<IdeaDTO> listIdeaDTO);
    List<IdeaDTO> listIdeaToListIdeaDTO(List<Idea> listIdea);
}
