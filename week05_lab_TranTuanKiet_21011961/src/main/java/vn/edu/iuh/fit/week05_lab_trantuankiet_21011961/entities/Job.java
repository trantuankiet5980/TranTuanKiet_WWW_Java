package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities;


import lombok.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Job {
    private Integer id;
    private String description;
    private Set<JobSkill> jobSkills = new HashSet<>();
}
