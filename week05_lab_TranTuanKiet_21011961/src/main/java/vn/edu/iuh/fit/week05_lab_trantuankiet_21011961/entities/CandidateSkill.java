package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class CandidateSkill {
    private Candidate candidate;
    private Skill skill;
    private int level;
}
