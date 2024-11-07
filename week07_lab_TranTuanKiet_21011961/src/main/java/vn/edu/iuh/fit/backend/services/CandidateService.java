package vn.edu.iuh.fit.backend.services;

import org.springframework.data.domain.Page;
import vn.edu.iuh.fit.backend.entities.Candidate;

import java.util.List;

public interface CandidateService {
    Page<Candidate> findAll(int pageNo, int pageSize, String sortBy, String sortDir);
    List<Candidate> getAll();
}
