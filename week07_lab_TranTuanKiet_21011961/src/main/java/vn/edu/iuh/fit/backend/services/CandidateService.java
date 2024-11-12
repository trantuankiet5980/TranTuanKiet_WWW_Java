package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.dtos.CandidateDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;

import java.util.List;

public interface CandidateService {
    List<CandidateDto> getAll();
    CandidateDto getById(Long id);
    CandidateDto save(CandidateDto candidateDto);
    List<CandidateDto> getCandidatePaging(int page, int size);
    CandidateDto findByEmailAndPhone(String email, String phone);
    PageDTO<CandidateDto> findCandidateMatchingJob(Long jobId, int per, int page, int size);
}
