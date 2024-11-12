package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.CandidateSkill}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateSkillDto implements Serializable {
    private Long skillId;
    private Long canId;
    private String skillLevel;
    private String moreInfo;
}