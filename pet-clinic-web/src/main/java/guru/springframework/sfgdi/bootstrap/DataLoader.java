package guru.springframework.sfgdi.bootstrap;

import guru.springframework.sfgdi.services.OwnerService;
import guru.springframework.sfgdi.services.VetService;
import guru.springframework.sfgdi.services.map.OwnerServiceMap;
import guru.springframework.sfgdi.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;



    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Owners...");

    }
}
