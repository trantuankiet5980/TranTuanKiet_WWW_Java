package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.JobDto;
import vn.edu.iuh.fit.backend.entities.Job;
import vn.edu.iuh.fit.backend.entities.JobSkill;

import java.util.ArrayList;
import java.util.List;

@Component
public class JobConvert {
    private final JobSkillConvert jobSkillConvert = new JobSkillConvert();
    private final CompanyConvert companyConvert = new CompanyConvert();

    public Job toEntity(JobDto dto) {
        if (dto == null) {
            return null;
        }

        Job entity = new Job();
        entity.setId(dto.getId());
        entity.setJobDesc(dto.getJobDesc());
        entity.setJobName(dto.getJobName());
        entity.setCompany(companyConvert.toEntity(dto.getCompany()));

        if (dto.getJobSkills() != null) {
            List<JobSkill> jobSkills = new ArrayList<>();
            dto.getJobSkills().forEach(skillDto -> {
                JobSkill skill = jobSkillConvert.toEntity(skillDto);
                skill.setJob(entity);
                jobSkills.add(skill);
            });
            entity.setJobSkills(jobSkills);
        }

        return entity;
    }

    public JobDto toDto(Job entity) {
        if (entity == null) {
            return null;
        }

        JobDto dto = new JobDto();
        dto.setId(entity.getId());
        dto.setJobDesc(entity.getJobDesc());
        dto.setJobName(entity.getJobName());
        dto.setCompany(companyConvert.toDto(entity.getCompany()));
        dto.setJobSkills(entity.getJobSkills() != null ? 
            entity.getJobSkills().stream()
                .map(jobSkillConvert::toDto)
                .toList() : null);

        return dto;
    }

    public Job partialUpdate(JobDto dto, Job entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getJobDesc() != null) {
            entity.setJobDesc(dto.getJobDesc());
        }
        if (dto.getJobName() != null) {
            entity.setJobName(dto.getJobName());
        }
        if (dto.getCompany() != null) {
            entity.setCompany(companyConvert.partialUpdate(dto.getCompany(), entity.getCompany()));
        }

        return entity;
    }
}