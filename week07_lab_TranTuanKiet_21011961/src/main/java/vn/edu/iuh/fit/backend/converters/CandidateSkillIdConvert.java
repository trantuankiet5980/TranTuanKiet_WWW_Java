package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.CandidateSkillIdDto;
import vn.edu.iuh.fit.backend.entities.CandidateSkillId;

public class CandidateSkillIdConvert {
    public static CandidateSkillIdDto toDto(CandidateSkillId candidateSkillId) {
        return CandidateSkillIdDto.builder()
                .skillId(candidateSkillId.getSkillId())
                .canId(candidateSkillId.getCanId())
                .build();
    }

    public static CandidateSkillId toEntity(CandidateSkillIdDto candidateSkillIdDto) {
        CandidateSkillId candidateSkillId = new CandidateSkillId();
        candidateSkillId.setSkillId(candidateSkillIdDto.getSkillId());
        candidateSkillId.setCanId(candidateSkillIdDto.getCanId());
        return candidateSkillId;
    }
}
