package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.Job}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobDto implements Serializable {
    Long id;
    String jobDesc;
    String jobName;
    CompanyDto company;
    List<JobSkillDto> jobSkills;
}