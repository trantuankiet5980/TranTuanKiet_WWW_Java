package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.JobSkillDto;
import vn.edu.iuh.fit.backend.dtos.SkillDto;
import vn.edu.iuh.fit.backend.entities.JobSkill;
import vn.edu.iuh.fit.backend.entities.JobSkillId;
import vn.edu.iuh.fit.backend.entities.Skill;

@Component
public class JobSkillConvert {
    private final SkillConvert skillConvert = new SkillConvert();

    public JobSkill toEntity(JobSkillDto dto) {
        if (dto == null) {
            return null;
        }

        JobSkill entity = new JobSkill();
        JobSkillId id = new JobSkillId();
        id.setSkillId(dto.getSkillId());
        id.setJobId(dto.getJobId());
        entity.setId(id);
        entity.setMoreInfos(dto.getMoreInfos());
        entity.setSkillLevel(dto.getSkillLevel());
        
        if (dto.getSkill() != null) {
            entity.setSkill(skillConvert.toEntity(dto.getSkill()));
        }

        return entity;
    }

    public JobSkillDto toDto(JobSkill entity) {
        if (entity == null) {
            return null;
        }

        JobSkillDto dto = new JobSkillDto();
        dto.setSkillId(entity.getId().getSkillId());
        dto.setJobId(entity.getId().getJobId());
        dto.setMoreInfos(entity.getMoreInfos());
        dto.setSkillLevel(entity.getSkillLevel());
        
        if (entity.getSkill() != null) {
            dto.setSkill(skillConvert.toDto(entity.getSkill()));
        }

        return dto;
    }

    public JobSkill partialUpdate(JobSkillDto dto, JobSkill entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getSkillId() != null) {
            entity.getId().setSkillId(dto.getSkillId());
        }
        if (dto.getJobId() != null) {
            entity.getId().setJobId(dto.getJobId());
        }
        if (dto.getMoreInfos() != null) {
            entity.setMoreInfos(dto.getMoreInfos());
        }
        if (dto.getSkillLevel() != null) {
            entity.setSkillLevel(dto.getSkillLevel());
        }

        return entity;
    }
}