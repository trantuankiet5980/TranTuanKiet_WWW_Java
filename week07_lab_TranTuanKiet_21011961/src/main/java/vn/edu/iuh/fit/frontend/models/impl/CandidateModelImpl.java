package vn.edu.iuh.fit.frontend.models.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.backend.dtos.CandidateDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;
import vn.edu.iuh.fit.backend.utils.AppUtil;
import vn.edu.iuh.fit.frontend.models.CandidateModel;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Component
public class CandidateModelImpl implements CandidateModel {

    private final RestTemplate restTemplate = new RestTemplate();


    @Override
    public List<CandidateDto> getAllCandidate() {
        String url = AppUtil.CANDIDATES_API;
        ResponseEntity<List<CandidateDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<CandidateDto>>() {
                });
        return response.getBody();
    }

    @Override
    public CandidateDto getCandidateById(Long id) {
        String url = AppUtil.CANDIDATES_API + "/search?id=" + id;
        ResponseEntity<CandidateDto> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<CandidateDto>() {
                });
        return response.getBody();
    }

    @Override
    public boolean insertCandidate(CandidateDto candidateDto) {
        return false;
    }

    @Override
    public List<CandidateDto> getCandidatePage(int page, int size) {
        String url = AppUtil.CANDIDATES_API + "/paging?page=" + page + "&size=" + size;
        ResponseEntity<List<CandidateDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<CandidateDto>>() {
                });
        return response.getBody();
    }

    @Override
    public CandidateDto getCandidateByEmailAndPhone(String email, String phone) {
        String url = AppUtil.CANDIDATES_API + "/candidateLogin?email=" + email + "&phone=" + phone;
        ResponseEntity<CandidateDto> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<CandidateDto>() {
                });
        return response.getBody();
    }

    @Override
    public PageDTO<CandidateDto> getCandidateMatchWithJob(Long jobId, int per, int page, int size) {
        String url = AppUtil.CANDIDATES_API + "/candidateMatchingJob?jobId=" + jobId + "&per=" + per + "&page=" + page + "&size=" + size;
        ResponseEntity<PageDTO<CandidateDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<PageDTO<CandidateDto>>() {
                });
        return response.getBody();
    }
}
