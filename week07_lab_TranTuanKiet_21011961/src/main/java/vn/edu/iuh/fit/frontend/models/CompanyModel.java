package vn.edu.iuh.fit.frontend.models;

import vn.edu.iuh.fit.backend.dtos.CompanyDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;

import java.util.List;

public interface CompanyModel {
    PageDTO<CompanyDto> getAllCompany();
    CompanyDto getCompanyById(Long id);
    boolean insertCompany(CompanyDto companyDto);
    CompanyDto getCompanyByEmailAndPhone(String email, String phone);
}
