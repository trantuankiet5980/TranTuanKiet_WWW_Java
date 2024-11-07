package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.JobSkillDto;
import vn.edu.iuh.fit.backend.entities.JobSkill;

public class JobSkillConvert {
    public static JobSkillDto toDto(JobSkill jobSkill) {
        return JobSkillDto.builder()
                .id(JobSkillIdConvert.toDto(jobSkill.getId()))
                .skill(SkillConvert.toDto(jobSkill.getSkill()))
                .moreInfos(jobSkill.getMoreInfos())
                .skillLevel(jobSkill.getSkillLevel())
                .build();
    }

    public static JobSkill toEntity(JobSkillDto jobSkillDto) {
        JobSkill jobSkill = new JobSkill();
        jobSkill.setId(JobSkillIdConvert.toEntity(jobSkillDto.getId()));
        jobSkill.setSkill(SkillConvert.toEntity(jobSkillDto.getSkill()));
        jobSkill.setMoreInfos(jobSkillDto.getMoreInfos());
        jobSkill.setSkillLevel(jobSkillDto.getSkillLevel());
        return jobSkill;
    }
}
