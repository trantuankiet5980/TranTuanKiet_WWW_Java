package vn.edu.iuh.fit.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.entities.Skill;
import vn.edu.iuh.fit.backend.repository.SkillRepository;
import vn.edu.iuh.fit.backend.services.SkillService;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skill findBySkillName(String skillName) {
        return skillRepository.findBySkillName(skillName);
    }

    @Override
    public List<Skill> getAll() {
        return skillRepository.findAll();
    }
}
