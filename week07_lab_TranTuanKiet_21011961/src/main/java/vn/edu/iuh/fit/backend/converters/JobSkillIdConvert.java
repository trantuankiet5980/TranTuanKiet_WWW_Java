package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.JobSkillIdDto;
import vn.edu.iuh.fit.backend.entities.JobSkillId;

public class JobSkillIdConvert {
    public static JobSkillIdDto toDto(JobSkillId jobSkillId) {
        return JobSkillIdDto.builder()
                .jobId(jobSkillId.getJobId())
                .skillId(jobSkillId.getSkillId())
                .build();
    }

    public static JobSkillId toEntity(JobSkillIdDto jobSkillIdDto) {
        JobSkillId jobSkillId = new JobSkillId();
        jobSkillId.setJobId(jobSkillIdDto.getJobId());
        jobSkillId.setSkillId(jobSkillIdDto.getSkillId());
        return jobSkillId;
    }
}
