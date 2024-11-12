package vn.edu.iuh.fit.frontend.models;

import vn.edu.iuh.fit.backend.dtos.CandidateDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;

import java.util.List;

public interface CandidateModel {
    List<CandidateDto> getAllCandidate();
    CandidateDto getCandidateById(Long id);
    boolean insertCandidate(CandidateDto candidateDto);
    List<CandidateDto> getCandidatePage(int page, int size);
    CandidateDto getCandidateByEmailAndPhone(String email, String phone);
    PageDTO<CandidateDto> getCandidateMatchWithJob(Long jobId, int per, int page, int size);
}
