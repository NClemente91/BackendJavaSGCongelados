package com.ayi.rest.serv.app.mappers.impl;

import com.ayi.rest.serv.app.dtos.request.AddressDTO;
import com.ayi.rest.serv.app.entities.Address;
import com.ayi.rest.serv.app.mappers.IAddressMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AddressMapperImpl implements IAddressMapper {

    private final ModelMapper modelMapper;

    @Override
    public Address requestDtoToEntity(AddressDTO requestDto) {

        return modelMapper.map(requestDto, Address.class);

    }
}
