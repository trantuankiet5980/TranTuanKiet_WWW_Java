package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.entities.Job;

import java.util.List;

public interface JobService {
    List<Job> findByCompanyId(Long companyId);
    List<Job> findBySkillName(String skillName);
    List<Job> findBySkillNames(List<String> skillNames);
    List<Job> getAll();
}
