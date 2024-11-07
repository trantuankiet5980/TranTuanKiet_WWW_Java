package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.JobSkillId}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JobSkillIdDto implements Serializable {
    Long jobId;
    Long skillId;
}