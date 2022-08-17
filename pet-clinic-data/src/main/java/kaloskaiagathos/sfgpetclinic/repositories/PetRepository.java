package kaloskaiagathos.sfgpetclinic.repositories;

import kaloskaiagathos.sfgpetclinic.model.Owner;
import kaloskaiagathos.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
