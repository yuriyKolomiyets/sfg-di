package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
