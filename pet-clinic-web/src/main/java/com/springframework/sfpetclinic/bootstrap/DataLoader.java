package com.springframework.sfpetclinic.bootstrap;

import com.springframework.sfpetclinic.model.Owner;
import com.springframework.sfpetclinic.model.Vet;
import com.springframework.sfpetclinic.services.OwnerService;
import com.springframework.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        owner1.setFirstName("Luca");
        owner1.setLastName("Feczak");

        ownerService.save(owner1);

        Owner owner13 = new Owner();
        owner13.setFirstName("Luca");
        owner13.setLastName("Feczak");

        ownerService.save(owner13);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mark");
        owner2.setLastName("Kalydy");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Johnas");
        vet1.setLastName("Fisher");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Johnas");
        vet2.setLastName("Fisher");

        vetService.save(vet2);

        System.out.println("Loaded vets!");


    }
}
