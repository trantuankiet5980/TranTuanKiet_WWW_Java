package vn.edu.iuh.fit.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.converts.CompanyConvert;
import vn.edu.iuh.fit.backend.dtos.CompanyDto;
import vn.edu.iuh.fit.backend.entities.Company;
import vn.edu.iuh.fit.backend.repositories.CompanyRepository;
import vn.edu.iuh.fit.backend.services.CompanyService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyConvert companyConvert;

    @Override
    public List<CompanyDto> getAllCompany() {
        List<Company> companies = companyRepository.findAll();
        return companies.stream().map(companyConvert::toDto).collect(Collectors.toList());
    }

    @Override
    public CompanyDto getCompanyById(Long id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.map(companyConvert::toDto).orElse(new CompanyDto());
    }

    @Override
    public boolean saveCompany(CompanyDto company) {
        Company companyEntity = companyConvert.toEntity(company);
        companyRepository.save(companyEntity);

        return true;
    }

    @Override
    public CompanyDto findByEmailAndPhone(String email, String phone) {
        Company company = companyRepository.findByEmailAndPhone(email, phone);
        return companyConvert.toDto(company);
    }
}
