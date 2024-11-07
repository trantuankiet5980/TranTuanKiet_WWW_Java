package vn.edu.iuh.fit.frontend.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.backend.dtos.SkillDto;
import vn.edu.iuh.fit.backend.entities.Skill;
import vn.edu.iuh.fit.frontend.models.SkillModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class SkillModelImpl implements SkillModels {
    @Autowired
    private RestTemplate restTemplate;

    private final String API_URL = "http://localhost:8082/api/skills";

    @Override
    public List<SkillDto> getAllSkills() {
        Skill[] skills = restTemplate.getForObject(API_URL, Skill[].class);
        if (skills == null) {
            return Collections.emptyList();
        }

        return Arrays.stream(skills)
                .map(skill -> new SkillDto(skill.getId(), skill.getSkillName(), skill.getSkillDescription(), skill.getType()))
                .toList();
    }
}
