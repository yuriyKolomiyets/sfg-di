package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().city("Kyiv").build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner byId = ownerMapService.findById(1L);
        assertEquals(1L, byId.getId().longValue());
        System.out.println(byId.getId().longValue());
    }

    @Test
    void save() {
        ownerMapService.save(Owner.builder().city("Kharkiv").build());

        Optional<Owner> ownerTest = ownerMapService.findAll()
                .stream().filter(owner -> owner.getCity().equals("Kharkiv"))
                .findFirst();
        assertTrue(ownerTest.isPresent());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(1L));
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(ownerSet.size(), 0);
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(1L);
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(ownerSet.size(), 0);

    }
}