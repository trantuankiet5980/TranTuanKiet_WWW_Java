package vn.edu.iuh.fit.backend.dtos;

import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;
import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.JobSkill}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobSkillDto implements Serializable {
    private Long jobId;
    private Long skillId;
    private SkillDto skill;
    private String moreInfos;
    private SkillLevel skillLevel;
}