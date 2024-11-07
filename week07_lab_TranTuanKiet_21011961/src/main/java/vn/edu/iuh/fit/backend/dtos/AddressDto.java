package vn.edu.iuh.fit.backend.dtos;

import com.neovisionaries.i18n.CountryCode;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.backend.entites.Address}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AddressDto implements Serializable {
    Long id;
    String street;
    String city;
    CountryCode country;
    String number;
    String zipcode;
}