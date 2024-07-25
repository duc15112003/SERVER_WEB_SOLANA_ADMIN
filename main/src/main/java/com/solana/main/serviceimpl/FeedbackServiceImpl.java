package com.solana.main.serviceimpl;

import com.solana.main.dao.FeedbackDAO;
import com.solana.main.dto.FeedbackDTO;
import com.solana.main.mapper.FeedbackMapper;
import com.solana.main.model.Feedback;
import com.solana.main.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    FeedbackDAO feedbackDAO;

    FeedbackMapper feedbackMapper = FeedbackMapper.INSTANCE;

    @Override
    public List<FeedbackDTO> getAllFeedbackDTO() {
        List<Feedback> listFeedback = feedbackDAO.findAll();
        return feedbackMapper.listFeedbackToListFeedbackDTO(listFeedback);
    }

    @Override
    public Optional<FeedbackDTO> getFeedbackDTOById(Long id) {
        Optional<Feedback> feedback = feedbackDAO.findById(id);
        if (feedback.isPresent()) {
            return Optional.ofNullable(feedbackMapper.FeedbackToFeedbackDTO(feedback.get()));
        }else{
            return null;
        }
    }

    @Override
    public FeedbackDTO saveFeedback(FeedbackDTO feedbackDTO) {
        Feedback feedback = feedbackMapper.FeedbackDTOToFeedback(feedbackDTO);
        Feedback savedFeedback = feedbackDAO.save(feedback);
        return feedbackMapper.FeedbackToFeedbackDTO(savedFeedback);
    }

    @Override
    public void deleteFeedback(Long id) {
        Optional<Feedback> feedback= feedbackDAO.findById(id);
        if(feedback.isPresent()){
            feedbackDAO.delete(feedback.get());
        }else{

        }
    }
}
