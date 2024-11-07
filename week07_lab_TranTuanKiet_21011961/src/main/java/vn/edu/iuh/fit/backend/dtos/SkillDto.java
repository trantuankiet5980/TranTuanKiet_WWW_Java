package vn.edu.iuh.fit.backend.dtos;

import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillType;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.Skill}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SkillDto implements Serializable {
    Long id;
    String skillDescription;
    String skillName;
    SkillType type;
}