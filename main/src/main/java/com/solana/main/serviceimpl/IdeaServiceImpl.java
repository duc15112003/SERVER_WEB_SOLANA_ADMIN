package com.solana.main.serviceimpl;

import com.solana.main.dao.IdeaDAO;
import com.solana.main.dto.IdeaDTO;
import com.solana.main.mapper.IdeaMapper;
import com.solana.main.model.Idea;
import com.solana.main.service.IdeaService;

import java.util.List;
import java.util.Optional;

public class IdeaServiceImpl implements IdeaService {
private final IdeaDAO ideaDAO;
private final IdeaMapper ideaMapper;

    public IdeaServiceImpl(IdeaDAO ideaDAO, IdeaMapper ideaMapper) {
        this.ideaDAO = ideaDAO;
        this.ideaMapper = IdeaMapper.INSTANCE;
    }

    @Override
    public List<IdeaDTO> getAllIdeaDTO() {
        List<Idea> listIdea = ideaDAO.findAll();
        return ideaMapper.listIdeaToListIdeaDTO(listIdea);
    }

    @Override
    public Optional<IdeaDTO> getIdeaDTOById(Long id) {
        Optional<Idea> idea = ideaDAO.findById(id);
        if (idea.isPresent()) {
            return Optional.ofNullable(ideaMapper.IdeaToIdeaDTO(idea.get()));
        }else{
            return null;
        }
    }

    @Override
    public IdeaDTO saveIdea(IdeaDTO IdeaDTO) {
        Idea idea = ideaMapper.IdeaDTOToIdea(IdeaDTO);
        Idea savedIdea = ideaDAO.save(idea);
        return ideaMapper.IdeaToIdeaDTO(savedIdea);
    }

    @Override
    public void deleteIdea(Long id) {
        Optional<Idea> idea= ideaDAO.findById(id);
        if(idea.isPresent()){
            ideaDAO.delete(idea.get());
        }else{

        }
    }
}
