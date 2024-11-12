package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.ExperienceDto;
import vn.edu.iuh.fit.backend.entities.Experience;

@Component
public class ExperienceConvert {
    public Experience toEntity(ExperienceDto dto) {
        if (dto == null) {
            return null;
        }

        Experience entity = new Experience();
        entity.setId(dto.getId());
        entity.setToDate(dto.getToDate());
        entity.setFromDate(dto.getFromDate());
        entity.setCompanyName(dto.getCompanyName());
        entity.setRole(dto.getRole());
        entity.setWorkDescription(dto.getWorkDescription());

        return entity;
    }

    public ExperienceDto toDto(Experience entity) {
        if (entity == null) {
            return null;
        }

        ExperienceDto dto = new ExperienceDto();
        dto.setId(entity.getId());
        dto.setToDate(entity.getToDate());
        dto.setFromDate(entity.getFromDate());
        dto.setCompanyName(entity.getCompanyName());
        dto.setRole(entity.getRole());
        dto.setWorkDescription(entity.getWorkDescription());

        return dto;
    }

    public Experience partialUpdate(ExperienceDto dto, Experience entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getToDate() != null) {
            entity.setToDate(dto.getToDate());
        }
        if (dto.getFromDate() != null) {
            entity.setFromDate(dto.getFromDate());
        }
        if (dto.getCompanyName() != null) {
            entity.setCompanyName(dto.getCompanyName());
        }
        if (dto.getRole() != null) {
            entity.setRole(dto.getRole());
        }
        if (dto.getWorkDescription() != null) {
            entity.setWorkDescription(dto.getWorkDescription());
        }

        return entity;
    }
}