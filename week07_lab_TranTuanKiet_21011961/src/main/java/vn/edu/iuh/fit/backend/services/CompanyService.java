package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.dtos.CompanyDto;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> getAllCompany();
    CompanyDto getCompanyById(Long id);
    boolean saveCompany(CompanyDto company);
    CompanyDto findByEmailAndPhone(String email, String phone);
}
