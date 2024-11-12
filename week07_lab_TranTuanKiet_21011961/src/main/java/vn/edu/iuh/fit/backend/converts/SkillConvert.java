package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.SkillDto;
import vn.edu.iuh.fit.backend.entities.Skill;

@Component
public class SkillConvert {
    public Skill toEntity(SkillDto dto) {
        if (dto == null) {
            return null;
        }

        Skill entity = new Skill();
        entity.setId(dto.getId());
        entity.setSkillDescription(dto.getSkillDescription());
        entity.setSkillName(dto.getSkillName());
        entity.setType(dto.getType());

        return entity;
    }

    public SkillDto toDto(Skill entity) {
        if (entity == null) {
            return null;
        }

        SkillDto dto = new SkillDto();
        dto.setId(entity.getId());
        dto.setSkillDescription(entity.getSkillDescription());
        dto.setSkillName(entity.getSkillName());
        dto.setType(entity.getType());

        return dto;
    }

    public Skill partialUpdate(SkillDto dto, Skill entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getSkillDescription() != null) {
            entity.setSkillDescription(dto.getSkillDescription());
        }
        if (dto.getSkillName() != null) {
            entity.setSkillName(dto.getSkillName());
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }

        return entity;
    }
}
