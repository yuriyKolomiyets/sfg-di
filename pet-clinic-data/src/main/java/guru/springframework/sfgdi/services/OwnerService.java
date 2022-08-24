package guru.springframework.sfgdi.services;
import guru.springframework.sfgdi.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}