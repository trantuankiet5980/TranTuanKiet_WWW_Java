package vn.edu.iuh.fit.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.converts.CandidateConvert;
import vn.edu.iuh.fit.backend.dtos.CandidateDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;
import vn.edu.iuh.fit.backend.entities.Candidate;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.backend.services.CandidateService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateConvert candidateConvert;

    @Override
    public List<CandidateDto> getAll() {
        List<Candidate> candidates = candidateRepository.findAll();
        return candidates.stream().map(candidateConvert::toDto).collect(Collectors.toList());
    }

    @Override
    public CandidateDto getById(Long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        return candidate.map(candidateConvert::toDto).orElse(new CandidateDto());
    }

    @Override
    public CandidateDto save(CandidateDto candidateDto) {
        Candidate candidate = candidateConvert.toEntity(candidateDto);
        candidate = candidateRepository.save(candidate);
        return candidateConvert.toDto(candidate);
    }

    @Override
    public List<CandidateDto> getCandidatePaging(int page, int size) {
        Page<Candidate> candidates = candidateRepository.findAll(PageRequest.of(page, size));
        return candidates.stream().map(candidateConvert::toDto).collect(Collectors.toList());
    }

    @Override
    public CandidateDto findByEmailAndPhone(String email, String phone) {
        Candidate candidate = candidateRepository.findByEmailAndPhone(email, phone);
        return candidateConvert.toDto(candidate);
    }

    @Override
    public PageDTO<CandidateDto> findCandidateMatchingJob(Long jobId, int per, int page, int size) {
        Page<Candidate> candidates = candidateRepository.findCandidateMatchingJob(jobId, per, PageRequest.of(page, size));
        PageDTO<CandidateDto> pageDTO = new PageDTO<>();
        List<CandidateDto> candidateDtos = candidates.stream().map(candidateConvert::toDto).collect(Collectors.toList());
        pageDTO.setContent(candidateDtos);
        pageDTO.setTotalPages(candidates.getTotalPages());
        pageDTO.setSize(candidates.getSize());
        pageDTO.setPage(candidates.getNumber());
        return pageDTO;
    }
}
