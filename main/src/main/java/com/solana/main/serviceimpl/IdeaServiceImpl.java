package com.solana.main.serviceimpl;

import com.solana.main.dto.IdeaDTO;
import com.solana.main.mapper.IdeaMapper;
import com.solana.main.service.IdeaService;

import java.util.List;
import java.util.Optional;

public class IdeaServiceImpl implements IdeaService {
private final IdeaServiceImpl ideaServiceImpl;
private final IdeaMapper ideaMapper;

    public IdeaServiceImpl(IdeaServiceImpl ideaServiceImpl, IdeaMapper ideaMapper) {
        this.ideaServiceImpl = ideaServiceImpl;
        this.ideaMapper = IdeaMapper.INSTANCE;
    }

    @Override
    public List<IdeaDTO> getAllIdeaDTO() {
        return ideaServiceImpl.getAllIdeaDTO();
    }

    @Override
    public Optional<IdeaDTO> getIdeaDTOById(Long id) {
        return Optional.empty();
    }

    @Override
    public IdeaDTO saveFeedback(IdeaDTO IdeaDTO) {
        return null;
    }

    @Override
    public void deleteIdea(Long id) {

    }
}
