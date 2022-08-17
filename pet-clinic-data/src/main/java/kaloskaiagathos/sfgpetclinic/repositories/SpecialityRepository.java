package kaloskaiagathos.sfgpetclinic.repositories;

import kaloskaiagathos.sfgpetclinic.model.PetType;
import kaloskaiagathos.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
