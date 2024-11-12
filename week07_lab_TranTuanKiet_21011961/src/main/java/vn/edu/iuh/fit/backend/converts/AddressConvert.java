package vn.edu.iuh.fit.backend.converts;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.dtos.AddressDto;
import vn.edu.iuh.fit.backend.entities.Address;

@Component
public class AddressConvert {
    public Address toEntity(AddressDto dto) {
        if (dto == null) {
            return null;
        }

        Address entity = new Address();
        entity.setId(dto.getId());
        entity.setStreet(dto.getStreet());
        entity.setCity(dto.getCity());
        entity.setCountry(dto.getCountry());
        entity.setNumber(dto.getNumber());
        entity.setZipcode(dto.getZipcode());

        return entity;
    }

    public AddressDto toDto(Address entity) {
        if (entity == null) {
            return null;
        }

        AddressDto dto = new AddressDto();
        dto.setId(entity.getId());
        dto.setStreet(entity.getStreet());
        dto.setCity(entity.getCity());
        dto.setCountry(entity.getCountry());
        dto.setNumber(entity.getNumber());
        dto.setZipcode(entity.getZipcode());

        return dto;
    }

    public Address partialUpdate(AddressDto dto, Address entity) {
        if (dto == null) {
            return entity;
        }

        if (dto.getStreet() != null) {
            entity.setStreet(dto.getStreet());
        }
        if (dto.getCity() != null) {
            entity.setCity(dto.getCity());
        }
        if (dto.getCountry() != null) {
            entity.setCountry(dto.getCountry());
        }
        if (dto.getNumber() != null) {
            entity.setNumber(dto.getNumber());
        }
        if (dto.getZipcode() != null) {
            entity.setZipcode(dto.getZipcode());
        }

        return entity;
    }
}