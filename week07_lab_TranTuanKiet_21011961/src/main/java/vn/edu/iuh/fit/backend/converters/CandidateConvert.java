package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.CandidateDto;
import vn.edu.iuh.fit.backend.entities.Candidate;

public class CandidateConvert {
    public static CandidateDto toDto(Candidate candidate) {
        return CandidateDto.builder()
                .id(candidate.getId())
                .dob(candidate.getDob())
                .email(candidate.getEmail())
                .fullName(candidate.getFullName())
                .phone(candidate.getPhone())
                .address(AddressConvert.toDto(candidate.getAddress()))
                .candidateSkills(candidate.getCandidateSkills().stream().map(CandidateSkillConvert::toDto).toList())
                .experiences(candidate.getExperiences().stream().map(ExperienceConvert::toDto).toList())
                .build();
    }

    public static Candidate toEntity(CandidateDto candidateDto) {
        Candidate candidate = new Candidate();
        candidate.setId(candidateDto.getId());
        candidate.setDob(candidateDto.getDob());
        candidate.setEmail(candidateDto.getEmail());
        candidate.setFullName(candidateDto.getFullName());
        candidate.setPhone(candidateDto.getPhone());
        candidate.setAddress(AddressConvert.toEntity(candidateDto.getAddress()));
        candidate.setCandidateSkills(candidateDto.getCandidateSkills().stream().map(CandidateSkillConvert::toEntity).toList());
        candidate.setExperiences(candidateDto.getExperiences().stream().map(ExperienceConvert::toEntity).toList());
        return candidate;
    }
}
