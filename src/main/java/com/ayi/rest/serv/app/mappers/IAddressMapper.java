package com.ayi.rest.serv.app.mappers;

import com.ayi.rest.serv.app.dtos.request.AddressDTO;
import com.ayi.rest.serv.app.entities.Address;

public interface IAddressMapper {
    Address requestDtoToEntity(AddressDTO requestDto);
}
