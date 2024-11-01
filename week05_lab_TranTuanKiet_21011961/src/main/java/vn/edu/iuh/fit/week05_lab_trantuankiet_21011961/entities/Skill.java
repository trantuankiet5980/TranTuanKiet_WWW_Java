package vn.edu.iuh.fit.week05_lab_trantuankiet_21011961.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Skill {
    private Integer id;
    private String skillName;
    private String description;
    private String field;

}
