package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findBylastName(String lastName);
    Owner findById(long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
