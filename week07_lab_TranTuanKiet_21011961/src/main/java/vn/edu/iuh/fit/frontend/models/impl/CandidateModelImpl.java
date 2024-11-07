package vn.edu.iuh.fit.frontend.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.backend.entities.Candidate;
import vn.edu.iuh.fit.frontend.models.CandidateModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class CandidateModelImpl implements CandidateModel {
    @Autowired
    private RestTemplate restTemplate;

    private final String API_URL = "http://localhost:8082/api/candidates";

    @Override
    public List<Candidate> getAll() {
        Candidate[] candidates = restTemplate.getForObject(API_URL, Candidate[].class);
        if (candidates == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(candidates);
    }
}
