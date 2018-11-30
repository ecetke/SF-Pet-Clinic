package com.springframework.sfpetclinic.bootstrap;

import com.springframework.sfpetclinic.model.Owner;
import com.springframework.sfpetclinic.model.Vet;
import com.springframework.sfpetclinic.services.OwnerService;
import com.springframework.sfpetclinic.services.VetService;
import com.springframework.sfpetclinic.services.map.OwnerServiceMap;
import com.springframework.sfpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Luca");
        owner1.setLastName("Feczak");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Mark");
        owner1.setLastName("Kalydy");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Johnas");
        vet1.setLastName("Fisher");

        vetService.save(vet1);

        System.out.println("Loaded just only one vet!");


    }
}
