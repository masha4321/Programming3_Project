package com.project.Project.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Project.entity.AddressEO;
import com.project.Project.model.Address;
import com.project.Project.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository repository;
    private ObjectMapper mapper;

    public AddressService(AddressRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Address saveAddress(Address address) {
        if (address.getAddressId() == null) {
            AddressEO eo = mapper.convertValue(address, AddressEO.class);
            Address result = mapper.convertValue(repository.save(eo), Address.class);
            return result;
        } else {
            Optional<AddressEO> userAddress = repository.findById(address.getAddressId());
            if (userAddress.isPresent()) {
                AddressEO eo = userAddress.get();
                eo.setAddressId(address.getAddressId());
                eo.setStreet(address.getStreet());
                eo.setAppartementNumber(address.getAppartementNumber());
                eo.setCity(address.getCity());
                eo.setProvinceOrState(address.getProvinceOrState());
                eo.setCountry(address.getCountry());
                eo.setPostalOrZipCode(address.getPostalOrZipCode());

                eo = repository.save(eo);
                return mapper.convertValue(eo, Address.class);
            } else {
                AddressEO eo = mapper.convertValue(address, AddressEO.class);
                Address result = mapper.convertValue(repository.save(eo), Address.class);
                return result;
            }
        }
    }
}
