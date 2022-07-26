package kaloskaiagathos.sfgpetclinic.services;

import kaloskaiagathos.sfgpetclinic.model.Owner;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
