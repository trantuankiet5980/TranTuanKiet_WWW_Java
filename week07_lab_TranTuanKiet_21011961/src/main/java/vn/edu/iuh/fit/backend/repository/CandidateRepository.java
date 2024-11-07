package vn.edu.iuh.fit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.entities.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    
}
