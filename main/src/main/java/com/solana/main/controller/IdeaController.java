package com.solana.main.controller;

import com.solana.main.dto.AccountDTO;
import com.solana.main.dto.IdeaDTO;
import com.solana.main.dto.IdeaDTO;
import com.solana.main.mapper.IdeaMapper;
import com.solana.main.serviceimpl.IdeaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/idea/")
public class IdeaController {
    @Autowired
    private IdeaServiceImpl ideaServiceImpl;

    @GetMapping
    public List<IdeaDTO> getAllProducts() {
        return ideaServiceImpl.getAllIdeaDTO();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IdeaDTO> getCustomerById(@PathVariable Long id) {
        return ideaServiceImpl.getIdeaDTOById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public IdeaDTO createProduct(@RequestBody IdeaDTO ideaDTO) {
        return ideaServiceImpl.saveIdea(ideaDTO);
    }
    private Long id;
    private String title;
    private String description;
    private String status;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private LocalDateTime endAt;
    private Long countFeedback;
    private BigDecimal awardForOneFeedback;
    private AccountDTO accountDTO;
    @PutMapping("/{id}")
    public ResponseEntity<IdeaDTO> updateCustomerDTO(@PathVariable Long id, @RequestBody IdeaDTO IdeaDTO) {
        return ideaServiceImpl.getIdeaDTOById(id)
                .map(existingIdeaDTO -> {
                    existingIdeaDTO.setId(IdeaDTO.getId());
                    existingIdeaDTO.setTitle(IdeaDTO.getTitle());
                    existingIdeaDTO.setDescription(IdeaDTO.getDescription());
                    existingIdeaDTO.setStatus(IdeaDTO.getStatus());
                    existingIdeaDTO.setImage(IdeaDTO.getImage());
                    existingIdeaDTO.setCreatedAt(IdeaDTO.getCreatedAt());
                    existingIdeaDTO.setUpdateAt(IdeaDTO.getUpdateAt());
                    existingIdeaDTO.setEndAt(IdeaDTO.getEndAt());
                    existingIdeaDTO.setCountFeedback(IdeaDTO.getCountFeedback());
                    existingIdeaDTO.setAwardForOneFeedback(IdeaDTO.getAwardForOneFeedback());
                    existingIdeaDTO.setAccountDTO(IdeaDTO.getAccountDTO());
                    IdeaDTO updatedIdea = ideaServiceImpl.saveIdea(existingIdeaDTO);
                    return ResponseEntity.ok(updatedIdea);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIdeaDTO(@PathVariable Long id) {
        if (ideaServiceImpl.getIdeaDTOById(id).isPresent()) {
            ideaServiceImpl.deleteIdea(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
