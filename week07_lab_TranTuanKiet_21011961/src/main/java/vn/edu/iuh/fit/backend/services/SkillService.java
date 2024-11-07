package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.entities.Skill;

import java.util.List;

public interface SkillService {
    Skill findBySkillName(String skillName);
    List<Skill> getAll();
}
