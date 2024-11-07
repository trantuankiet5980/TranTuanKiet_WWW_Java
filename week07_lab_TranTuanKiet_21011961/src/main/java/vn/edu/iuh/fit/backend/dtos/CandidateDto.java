package vn.edu.iuh.fit.backend.dtos;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.Candidate}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class CandidateDto implements Serializable {
    Long id;
    LocalDate dob;
    String email;
    String fullName;
    String phone;
    AddressDto address;
    List<CandidateSkillDto> candidateSkills;
    List<ExperienceDto> experiences;

    public String getFullAddress() {
        StringBuilder fullAddress = new StringBuilder();

        if (address.getNumber() != null && !address.getNumber().isEmpty()) {
            fullAddress.append(address.getNumber()).append(", ");
        }
        if (address.getStreet() != null && !address.getStreet().isEmpty()) {
            fullAddress.append(address.getStreet()).append(", ");
        }
        if (address.getCity() != null && !address.getCity().isEmpty()) {
            fullAddress.append(address.getCity()).append(", ");
        }
        if (address.getCountry() != null) {
            fullAddress.append(address.getCountry().getName()).append(", ");
        }
        if (address.getZipcode() != null && !address.getZipcode().isEmpty()) {
            fullAddress.append(address.getZipcode());
        }

        if (!fullAddress.isEmpty() && fullAddress.charAt(fullAddress.length() - 1) == ' ') {
            fullAddress.setLength(fullAddress.length() - 2);
        }

        return fullAddress.toString();
    }
}