package com.springframework.sfpetclinic.services;

import com.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner findByFirstName(String firstName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
