package kaloskaiagathos.sfgpetclinic.repositories;

import kaloskaiagathos.sfgpetclinic.model.PetType;
import kaloskaiagathos.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
