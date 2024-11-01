package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Builder
@Setter
public class JobSkill {
    private Job job;
    private Skill skill;
    private int specific_level;
}
