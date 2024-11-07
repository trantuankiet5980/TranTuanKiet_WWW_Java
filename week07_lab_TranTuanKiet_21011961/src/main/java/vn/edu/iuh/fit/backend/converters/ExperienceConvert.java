package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.ExperienceDto;
import vn.edu.iuh.fit.backend.entities.Experience;

public class ExperienceConvert {
    public static ExperienceDto toDto(Experience experience) {
        return ExperienceDto.builder()
                .id(experience.getId())
                .toDate(experience.getToDate())
                .fromDate(experience.getFromDate())
                .companyName(experience.getCompanyName())
                .role(experience.getRole())
                .workDescription(experience.getWorkDescription())
                .build();
    }

    public static Experience toEntity(ExperienceDto experienceDto) {
        Experience experience = new Experience();
        experience.setId(experienceDto.getId());
        experience.setToDate(experienceDto.getToDate());
        experience.setFromDate(experienceDto.getFromDate());
        experience.setCompanyName(experienceDto.getCompanyName());
        experience.setRole(experienceDto.getRole());
        experience.setWorkDescription(experienceDto.getWorkDescription());
        return experience;
    }
}
