package kaloskaiagathos.sfgpetclinic.services;

import kaloskaiagathos.sfgpetclinic.model.Owner;
import kaloskaiagathos.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
