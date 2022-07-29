package kaloskaiagathos.sfgpetclinic.services;

import kaloskaiagathos.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
