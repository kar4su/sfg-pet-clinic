package de.ninjacodes.sfgpetclinic.bootstrap;

import de.ninjacodes.sfgpetclinic.model.Owner;
import de.ninjacodes.sfgpetclinic.model.Vet;
import de.ninjacodes.sfgpetclinic.services.OwnerService;
import de.ninjacodes.sfgpetclinic.services.VetService;
import de.ninjacodes.sfgpetclinic.services.map.OwnerServiceMap;
import de.ninjacodes.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by kar4su
 */
@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {


        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Marc");
        owner1.setLastName("Aurel");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Wayne");
        owner2.setLastName("Dyer");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Peter");
        vet1.setLastName("Strugglingcat");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ray");
        vet2.setLastName("Budgielove");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
