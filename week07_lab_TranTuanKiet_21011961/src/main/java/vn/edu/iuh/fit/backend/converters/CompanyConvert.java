package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.CompanyDto;
import vn.edu.iuh.fit.backend.entities.Company;

public class CompanyConvert {
    public static CompanyDto toDto(Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .about(company.getAbout())
                .email(company.getEmail())
                .compName(company.getCompName())
                .phone(company.getPhone())
                .webUrl(company.getWebUrl())
                .address(AddressConvert.toDto(company.getAddress()))
                .build();
    }

    public static Company toEntity(CompanyDto companyDto) {
        Company company = new Company();
        company.setId(companyDto.getId());
        company.setAbout(companyDto.getAbout());
        company.setEmail(companyDto.getEmail());
        company.setCompName(companyDto.getCompName());
        company.setPhone(companyDto.getPhone());
        company.setWebUrl(companyDto.getWebUrl());
        company.setAddress(AddressConvert.toEntity(companyDto.getAddress()));
        return company;
    }
}
