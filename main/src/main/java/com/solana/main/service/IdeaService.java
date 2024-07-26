package com.solana.main.service;

import com.solana.main.dto.FeedbackDTO;
import com.solana.main.dto.IdeaDTO;

import java.util.List;
import java.util.Optional;

public interface IdeaService {
    public List<IdeaDTO> getAllIdeaDTO();
    public Optional<IdeaDTO> getIdeaDTOById(Long id);
    public IdeaDTO saveIdea(IdeaDTO IdeaDTO);
    public void deleteIdea(Long id);
}
