package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entities.Company}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CompanyDto implements Serializable {
    Long id;
    String about;
    String email;
    String compName;
    String phone;
    String webUrl;
    AddressDto address;

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