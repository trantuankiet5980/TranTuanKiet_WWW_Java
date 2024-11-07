package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.JobDto;
import vn.edu.iuh.fit.backend.entities.Job;

public class JobConvert {
    public static JobDto toDto(Job job) {
        return JobDto.builder()
                .id(job.getId())
                .jobDesc(job.getJobDesc())
                .jobName(job.getJobName())
                .company(CompanyConvert.toDto(job.getCompany()))
                .jobSkills(job.getJobSkills().stream().map(JobSkillConvert::toDto).toList())
                .build();
    }

    public static Job toEntity(JobDto jobDto) {
        Job job = new Job();
        job.setId(jobDto.getId());
        job.setJobDesc(jobDto.getJobDesc());
        job.setJobName(jobDto.getJobName());
        job.setCompany(CompanyConvert.toEntity(jobDto.getCompany()));
        job.setJobSkills(jobDto.getJobSkills().stream().map(JobSkillConvert::toEntity).toList());
        return job;
    }
}
