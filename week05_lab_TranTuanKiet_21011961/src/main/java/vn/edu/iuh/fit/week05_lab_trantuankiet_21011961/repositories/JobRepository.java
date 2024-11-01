package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.repositories;

import vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities.Candidate;
import vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities.Job;
import vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities.JobSkill;

import java.util.List;

public interface JobRepository {
    public Job save(Job job);
    public Job findById(int id);
    public boolean delete(int id);
    public List<Job> findAll();
    public boolean addSkill(Job job, List<JobSkill> jobSkills);

    public List<Candidate> findCandidates(int jobId);

}
