package com.solana.main.mapper;

import com.solana.main.dto.FeedbackDTO;
import com.solana.main.model.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    FeedbackMapper INSTANCE = Mappers.getMapper( FeedbackMapper.class );

    FeedbackDTO FeedbackToFeedbackDTO(Feedback Feedback);
    Feedback FeedbackDTOToFeedback(FeedbackDTO FeedbackDto);
    List<Feedback> listFeedbackDTOToListFeedback(List<FeedbackDTO> listFeedbackDTO);
    List<FeedbackDTO> listFeedbackToListFeedbackDTO(List<Feedback> listFeedback);
}
