package kaloskaiagathos.sfgpetclinic.services.springdatajpa;

import kaloskaiagathos.sfgpetclinic.model.Owner;
import kaloskaiagathos.sfgpetclinic.repositories.OwnerRepository;
import kaloskaiagathos.sfgpetclinic.repositories.PetRepository;
import kaloskaiagathos.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;


    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1L).lastName(LAST_NAME).build();

    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());
        when(service.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());

    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = service.findById(1L);
        assertNotNull(owner);


    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner = service.findById(1L);
        assertNull(owner);


    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();
        when(ownerRepository.save(ownerToSave)).thenReturn(ownerToSave);
        Owner owner = service.save(ownerToSave);

        assertNotNull(owner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {

        Owner ownerToDelete = Owner.builder().id(1L).build();
        when(ownerRepository.save(ownerToDelete)).thenReturn(ownerToDelete);
        Owner owner = service.save(ownerToDelete);
        service.delete(ownerToDelete);

        assertEquals(0,service.findAll().size());

    }

    @Test
    void deleteById() {
        Owner ownerToDelete = Owner.builder().id(1L).build();
        when(ownerRepository.save(ownerToDelete)).thenReturn(ownerToDelete);
        Owner owner = service.save(ownerToDelete);

        service.deleteById(1L);

        assertEquals(0,service.findAll().size());

    }

    @Test
    void findByLastName() {
        when(service.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = service.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }
}