package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.repositories;

import vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities.Job;
import vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities.Skill;

import java.util.List;

public interface SkillRepository {
    public Skill save(Skill skill);
    public Skill findById(int id);
    public boolean delete(int id);
    public List<Skill> findAll();
    List<Skill> findByJobId(Job job);
}
