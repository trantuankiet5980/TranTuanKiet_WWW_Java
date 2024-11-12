package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.CompanyDto;
import vn.edu.iuh.fit.backend.entities.Company;

@Component
public class CompanyConvert {
    public Company toEntity(CompanyDto dto) {
        if (dto == null) {
            return null;
        }

        Company entity = new Company();
        entity.setId(dto.getId());
        entity.setAbout(dto.getAbout());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setWebUrl(dto.getWebUrl());
        entity.setCompName(dto.getCompName());
        entity.setAddress(new AddressConvert().toEntity(dto.getAddress()));

        return entity;
    }

    public CompanyDto toDto(Company entity) {
        if (entity == null) {
            return null;
        }

        CompanyDto dto = new CompanyDto();
        dto.setId(entity.getId());
        dto.setAbout(entity.getAbout());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setWebUrl(entity.getWebUrl());
        dto.setCompName(entity.getCompName());
        dto.setAddress(new AddressConvert().toDto(entity.getAddress()));

        return dto;
    }

    public Company partialUpdate(CompanyDto dto, Company entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getAbout() != null) {
            entity.setAbout(dto.getAbout());
        }
        if (dto.getEmail() != null) {
            entity.setEmail(dto.getEmail());
        }
        if (dto.getPhone() != null) {
            entity.setPhone(dto.getPhone());
        }
        if (dto.getWebUrl() != null) {
            entity.setWebUrl(dto.getWebUrl());
        }
        if (dto.getCompName() != null) {
            entity.setCompName(dto.getCompName());
        }
        if (dto.getAddress() != null) {
            entity.setAddress(new AddressConvert().partialUpdate(dto.getAddress(), entity.getAddress()));
        }

        return entity;
    }
}