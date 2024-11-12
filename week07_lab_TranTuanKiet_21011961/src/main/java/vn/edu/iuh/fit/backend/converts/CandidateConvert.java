package vn.edu.iuh.fit.backend.converts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.CandidateDto;
import vn.edu.iuh.fit.backend.entities.Candidate;
import vn.edu.iuh.fit.backend.entities.CandidateSkill;
import vn.edu.iuh.fit.backend.entities.Experience;

import java.util.ArrayList;
import java.util.List;

@Component
public class CandidateConvert {
    @Autowired(required = false)
    private CandidateSkillConvert candidateSkillConvert;
    @Autowired(required = false)
    private ExperienceConvert experienceConvert;
    @Autowired (required = false)
    private AddressConvert addressConvert;

    public Candidate toEntity(CandidateDto dto) {
        if (dto == null) {
            return null;
        }

        Candidate entity = new Candidate();
        entity.setId(dto.getId());
        entity.setDob(dto.getDob());
        entity.setEmail(dto.getEmail());
        entity.setFullName(dto.getFullName());
        entity.setPhone(dto.getPhone());
        entity.setAddress(addressConvert.toEntity(dto.getAddress()));

        if (dto.getCandidateSkills() != null) {
            List<CandidateSkill> candidateSkills = new ArrayList<>();
            dto.getCandidateSkills().forEach(skillDto -> {
                CandidateSkill skill = candidateSkillConvert.toEntity(skillDto);
                skill.setCandidate(entity);
                candidateSkills.add(skill);
            });
            entity.setCandidateSkills(candidateSkills);
        }

        if (dto.getExperiences() != null) {
            List<Experience> experiences = new ArrayList<>();
            dto.getExperiences().forEach(expDto -> {
                Experience exp = experienceConvert.toEntity(expDto);
                exp.setCandidate(entity);
                experiences.add(exp);
            });
            entity.setExperiences(experiences);
        }

        return entity;
    }

    public CandidateDto toDto(Candidate entity) {
        if (entity == null) {
            return null;
        }

        CandidateDto dto = new CandidateDto();
        dto.setId(entity.getId());
        dto.setDob(entity.getDob());
        dto.setEmail(entity.getEmail());
        dto.setFullName(entity.getFullName());
        dto.setPhone(entity.getPhone());
        dto.setAddress(addressConvert.toDto(entity.getAddress()));

        if (entity.getCandidateSkills() != null) {
            dto.setCandidateSkills(entity.getCandidateSkills().stream()
                    .map(candidateSkillConvert::toDto)
                    .toList());
        }

        if (entity.getExperiences() != null) {
            dto.setExperiences(entity.getExperiences().stream()
                    .map(experienceConvert::toDto)
                    .toList());
        }

        return dto;
    }

    public Candidate partialUpdate(CandidateDto dto, Candidate entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getDob() != null) {
            entity.setDob(dto.getDob());
        }
        if (dto.getEmail() != null) {
            entity.setEmail(dto.getEmail());
        }
        if (dto.getFullName() != null) {
            entity.setFullName(dto.getFullName());
        }
        if (dto.getPhone() != null) {
            entity.setPhone(dto.getPhone());
        }
        if (dto.getAddress() != null) {
            entity.setAddress(addressConvert.partialUpdate(dto.getAddress(), entity.getAddress()));
        }

        return entity;
    }
}