package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.CandidateSkillDto;
import vn.edu.iuh.fit.backend.entities.CandidateSkill;
import vn.edu.iuh.fit.backend.entities.CandidateSkillId;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

@Component
public class CandidateSkillConvert {

    public CandidateSkill toEntity(CandidateSkillDto dto) {
        if (dto == null) {
            return null;
        }

        CandidateSkill entity = new CandidateSkill();
        CandidateSkillId id = new CandidateSkillId();
        id.setSkillId(dto.getSkillId());
        id.setCanId(dto.getCanId());
        entity.setId(id);
        entity.setMoreInfos(dto.getMoreInfo());
        entity.setSkillLevel(SkillLevel.valueOf(dto.getSkillLevel()));

        return entity;
    }

    public CandidateSkillDto toDto(CandidateSkill entity) {
        if (entity == null) {
            return null;
        }

        CandidateSkillDto dto = new CandidateSkillDto();
        dto.setSkillId(entity.getId().getSkillId());
        dto.setCanId(entity.getId().getCanId());
        dto.setMoreInfo(entity.getMoreInfos());
        dto.setSkillLevel(entity.getSkillLevel().toString());

        return dto;
    }

    public CandidateSkill partialUpdate(CandidateSkillDto dto, CandidateSkill entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getSkillId() != null) {
            entity.getId().setSkillId(dto.getSkillId());
        }
        if (dto.getCanId() != null) {
            entity.getId().setCanId(dto.getCanId());
        }
        if (dto.getMoreInfo() != null) {
            entity.setMoreInfos(dto.getMoreInfo());
        }
        if (dto.getSkillLevel() != null) {
            entity.setSkillLevel(SkillLevel.valueOf(dto.getSkillLevel()));
        }

        return entity;
    }
}