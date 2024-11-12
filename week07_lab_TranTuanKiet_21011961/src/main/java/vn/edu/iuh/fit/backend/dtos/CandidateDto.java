package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.Candidate}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateDto implements Serializable{
    Long id;
    LocalDate dob;
    String email;
    String fullName;
    String phone;
    AddressDto address;
    List<CandidateSkillDto> candidateSkills;
    List<ExperienceDto> experiences;
}