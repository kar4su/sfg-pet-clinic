package de.ninjacodes.sfgpetclinic.services;

import de.ninjacodes.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
