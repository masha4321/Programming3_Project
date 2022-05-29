package com.project.Project.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Project.entity.AddressEO;
import com.project.Project.model.Address;
import com.project.Project.repository.AddressRepository;
import com.project.Project.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;
    private final UserRepository userRepository;
    private ObjectMapper mapper;

    public AddressService(AddressRepository addressRepository, ObjectMapper mapper, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public Address saveAddress(Address address) {
        if (address.getAddressId() == null ){
            AddressEO eo = mapper.convertValue(address, AddressEO.class);
            Address result = mapper.convertValue(addressRepository.save(eo), Address.class);
            return result;
        } else {
            Optional<AddressEO> userAddress = addressRepository.findById(address.getAddressId());
            if (userAddress.isPresent()) {
                AddressEO eo = userAddress.get();
                eo.setAddressId(address.getAddressId());
                eo.setStreet(address.getStreet());
                eo.setAppartementNumber(address.getAppartementNumber());
                eo.setCity(address.getCity());
                eo.setProvinceOrState(address.getProvinceOrState());
                eo.setCountry(address.getCountry());
                eo.setPostalOrZipCode(address.getPostalOrZipCode());

                eo = addressRepository.save(eo);
                return mapper.convertValue(eo, Address.class);
            } else {
                AddressEO eo = mapper.convertValue(address, AddressEO.class);
                Address result = mapper.convertValue(addressRepository.save(eo), Address.class);
                return result;
            }
        }
    }
}
