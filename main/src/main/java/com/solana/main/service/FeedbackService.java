package com.solana.main.service;

import com.solana.main.dto.FeedbackDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface FeedbackService {

    public List<FeedbackDTO> getAllFeedbackDTO();
    public Optional<FeedbackDTO> getFeedbackDTOById(Long id);
    public FeedbackDTO saveFeedback(FeedbackDTO feedbackDTO);
    public void deleteFeedback(Long id);
}
