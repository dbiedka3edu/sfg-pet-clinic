package kaloskaiagathos.sfgpetclinic.services;

import kaloskaiagathos.sfgpetclinic.model.Owner;
import kaloskaiagathos.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
