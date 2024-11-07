package vn.edu.iuh.fit.backend.dtos;

import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.CandidateSkill}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CandidateSkillDto implements Serializable {
    CandidateSkillIdDto id;
    SkillDto skill;
    String moreInfos;
    SkillLevel skillLevel;
}