package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.CandidateSkillId}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CandidateSkillIdDto implements Serializable {
    Long skillId;
    Long canId;
}