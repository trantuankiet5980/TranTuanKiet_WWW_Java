package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.SkillDto;
import vn.edu.iuh.fit.backend.entities.Skill;

public class SkillConvert {
    public static SkillDto toDto(Skill skill) {
        return SkillDto.builder()
                .id(skill.getId())
                .skillDescription(skill.getSkillDescription())
                .skillName(skill.getSkillName())
                .type(skill.getType())
                .build();
    }

    public static Skill toEntity(SkillDto skillDto) {
        Skill skill = new Skill();
        skill.setId(skillDto.getId());
        skill.setSkillDescription(skillDto.getSkillDescription());
        skill.setSkillName(skillDto.getSkillName());
        skill.setType(skillDto.getType());
        return skill;
    }
}
