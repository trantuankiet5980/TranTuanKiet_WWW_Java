package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.CandidateSkillDto;
import vn.edu.iuh.fit.backend.entities.CandidateSkill;

public class CandidateSkillConvert {
    public static CandidateSkillDto toDto(CandidateSkill candidateSkill) {
        return CandidateSkillDto.builder()
                .id(CandidateSkillIdConvert.toDto(candidateSkill.getId()))
                .skill(SkillConvert.toDto(candidateSkill.getSkill()))
                .moreInfos(candidateSkill.getMoreInfos())
                .skillLevel(candidateSkill.getSkillLevel())
                .build();
    }

    public static CandidateSkill toEntity(CandidateSkillDto candidateSkillDto) {
        CandidateSkill candidateSkill = new CandidateSkill();
        candidateSkill.setId(CandidateSkillIdConvert.toEntity(candidateSkillDto.getId()));
        candidateSkill.setSkill(SkillConvert.toEntity(candidateSkillDto.getSkill()));
        candidateSkill.setMoreInfos(candidateSkillDto.getMoreInfos());
        candidateSkill.setSkillLevel(candidateSkillDto.getSkillLevel());
        return candidateSkill;
    }
}
