package com.springframework.sfpetclinic.services;

import com.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    Owner findByFirstName(String firstName);
}
