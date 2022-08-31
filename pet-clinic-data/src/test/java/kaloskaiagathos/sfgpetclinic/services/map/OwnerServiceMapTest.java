package kaloskaiagathos.sfgpetclinic.services.map;

import kaloskaiagathos.sfgpetclinic.model.Owner;
import kaloskaiagathos.sfgpetclinic.services.PetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() {

        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(0, ownerSet.size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner savedOwner = ownerServiceMap.save(owner2);

        assertEquals(id, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner3 = Owner.builder().build();
        Owner savedOwner = ownerServiceMap.save(owner3);
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());


    }


    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, owner.getId());

    }



    @Test
    void findByLastName() {
        Owner smith=ownerServiceMap.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId,smith.getId());
    }

    @Test
    void findByLastNotFound() {
        Owner smith=ownerServiceMap.findByLastName("iks");
        assertNull(smith);

    }
}