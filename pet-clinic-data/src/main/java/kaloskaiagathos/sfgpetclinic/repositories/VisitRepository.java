package kaloskaiagathos.sfgpetclinic.repositories;

import kaloskaiagathos.sfgpetclinic.model.PetType;
import kaloskaiagathos.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
