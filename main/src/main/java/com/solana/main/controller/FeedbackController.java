package com.solana.main.controller;

import com.solana.main.dto.CustomerDTO;
import com.solana.main.dto.FeedbackDTO;
import com.solana.main.serviceimpl.CustomerServiceImpl;
import com.solana.main.serviceimpl.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackServiceImpl feedbackServiceImpl;

    @GetMapping
    public List<FeedbackDTO> getAllProducts() {
        return feedbackServiceImpl.getAllFeedbackDTO();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FeedbackDTO> getCustomerById(@PathVariable Long id) {
        return feedbackServiceImpl.getFeedbackDTOById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public FeedbackDTO createProduct(@RequestBody FeedbackDTO feedbackDTO) {
        return feedbackServiceImpl.saveFeedback(feedbackDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FeedbackDTO> updateCustomerDTO(@PathVariable Long id, @RequestBody FeedbackDTO feedbackDTO) {
        return feedbackServiceImpl.getFeedbackDTOById(id)
                .map(existingFeedbackDTO -> {
                    existingFeedbackDTO.setId(feedbackDTO.getId());
                    existingFeedbackDTO.setFeedback(feedbackDTO.getFeedback());
                    existingFeedbackDTO.setAccountDTO(feedbackDTO.getAccountDTO());
                    existingFeedbackDTO.setIdeaDTO(feedbackDTO.getIdeaDTO());
                    existingFeedbackDTO.setRate(feedbackDTO.getRate());
                    existingFeedbackDTO.setCreateAt(feedbackDTO.getCreateAt());
                    existingFeedbackDTO.setStatus(feedbackDTO.getStatus());
                    FeedbackDTO updatedFeedback = feedbackServiceImpl.saveFeedback(existingFeedbackDTO);
                    return ResponseEntity.ok(updatedFeedback);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIdeaDTO(@PathVariable Long id) {
        if (feedbackServiceImpl.getFeedbackDTOById(id).isPresent()) {
            feedbackServiceImpl.deleteFeedback(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
