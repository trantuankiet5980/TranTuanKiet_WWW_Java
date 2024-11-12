package vn.edu.iuh.fit.backend.services;
import vn.edu.iuh.fit.backend.dtos.JobDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;

import java.util.List;

public interface JobService {
    List<JobDto> getAllJobs();
    JobDto getJobById(Long id);
    PageDTO<JobDto> getJobsByName(String name, int page, int size);
    PageDTO<JobDto> getJobsPaging(int page, int size);
    int countPageJobs(int size);
    PageDTO<JobDto> getJobsMatchingCandidate(Long candidateId, int per, int page, int size);
    PageDTO<JobDto> getJobsByCompanyId(Long companyId, int page, int size);
    PageDTO<JobDto> getJobsByCompanyAndName(Long companyId, String name, int page, int size);
}
