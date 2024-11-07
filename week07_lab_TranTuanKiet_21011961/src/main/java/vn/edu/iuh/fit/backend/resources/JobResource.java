package vn.edu.iuh.fit.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.backend.entities.Job;
import vn.edu.iuh.fit.backend.services.JobService;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobResource {
    @Autowired
    private JobService jobService;

    @GetMapping("/company/{companyId}")
    public List<Job> findByCompanyId(@PathVariable Long companyId) {
        return jobService.findByCompanyId(companyId);
    }

    @GetMapping("/skill/{skillName}")
    public List<Job> findBySkillName(@PathVariable String skillName) {
        return jobService.findBySkillName(skillName);
    }

    @GetMapping("/skills/{skillNames}")
    public List<Job> findBySkillNames(@PathVariable List<String> skillNames) {
        return jobService.findBySkillNames(skillNames);
    }

    @GetMapping
    public List<Job> getAll() {
        return jobService.getAll();
    }
}
