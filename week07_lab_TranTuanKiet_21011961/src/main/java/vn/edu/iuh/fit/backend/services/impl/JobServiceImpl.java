package vn.edu.iuh.fit.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.entities.Job;
import vn.edu.iuh.fit.backend.repository.JobRepository;
import vn.edu.iuh.fit.backend.services.JobService;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> findByCompanyId(Long companyId) {
        return jobRepository.findByCompanyId(companyId);
    }

    @Override
    public List<Job> findBySkillName(String skillName) {
        return jobRepository.findBySkillName(skillName);
    }

    @Override
    public List<Job> findBySkillNames(List<String> skillNames) {
        return jobRepository.findBySkillNames(skillNames);
    }

    @Override
    public List<Job> getAll() {
        return jobRepository.findAll();
    }

}
