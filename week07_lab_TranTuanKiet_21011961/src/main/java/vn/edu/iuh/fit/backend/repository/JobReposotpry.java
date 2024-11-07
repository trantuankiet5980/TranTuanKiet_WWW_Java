package vn.edu.iuh.fit.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.backend.entities.Job;

import java.util.List;

public interface JobReposotpry extends JpaRepository<Job, Long> {
    List<Job> findByCompanyId(Long companyId);
    
    @Query("SELECT j FROM Job j JOIN j.jobSkills js WHERE js.skill.skillName = :skillName")
    List<Job> findBySkillName(@Param("skillName") String skillName);
    
    @Query("SELECT j FROM Job j JOIN j.jobSkills js WHERE js.skill.skillName IN :skillNames")
    List<Job> findBySkillNames(@Param("skillNames") List<String> skillNames);
}
