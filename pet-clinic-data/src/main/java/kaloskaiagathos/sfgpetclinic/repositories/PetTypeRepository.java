package kaloskaiagathos.sfgpetclinic.repositories;

import kaloskaiagathos.sfgpetclinic.model.Pet;
import kaloskaiagathos.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
