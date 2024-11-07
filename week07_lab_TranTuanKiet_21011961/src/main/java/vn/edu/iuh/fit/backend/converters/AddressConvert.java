package vn.edu.iuh.fit.backend.converters;

import vn.edu.iuh.fit.backend.dtos.AddressDto;
import vn.edu.iuh.fit.backend.entities.Address;

public class AddressConvert {
    public static AddressDto toDto(Address address) {
        return AddressDto.builder()
                .id(address.getId())
                .street(address.getStreet())
                .city(address.getCity())
                .country(address.getCountry())
                .number(address.getNumber())
                .zipcode(address.getZipcode())
                .build();
    }

    public static Address toEntity(AddressDto addressDto) {
        Address address = new Address();
        address.setId(addressDto.getId());
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        address.setCountry(addressDto.getCountry());
        address.setNumber(addressDto.getNumber());
        address.setZipcode(addressDto.getZipcode());
        return address;
    }
}
