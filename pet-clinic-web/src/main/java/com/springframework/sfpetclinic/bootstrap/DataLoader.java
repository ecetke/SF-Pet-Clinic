package com.springframework.sfpetclinic.bootstrap;

import com.springframework.sfpetclinic.model.Owner;
import com.springframework.sfpetclinic.model.Pet;
import com.springframework.sfpetclinic.model.PetType;
import com.springframework.sfpetclinic.model.Vet;
import com.springframework.sfpetclinic.services.OwnerService;
import com.springframework.sfpetclinic.services.PetTypeService;
import com.springframework.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner luca = new Owner();
        luca.setFirstName("Luca");
        luca.setLastName("Feczak");
        luca.setAddress("Bethlen Gábor");
        luca.setCity("Budapest");
        luca.setTelephone("+36202265499");

        Pet aysha = new Pet();
        aysha.setName("Aysha");
        aysha.setBirthDate(LocalDate.of(2014, 06, 14));
        aysha.setPetType(savedDogPetType);
        aysha.setOwner(luca);
        ownerService.save(luca);


        Owner mark = new Owner();
        mark.setFirstName("Mark");
        mark.setLastName("Kalydy");
        mark.setAddress("Bethlen Gábor");
        mark.setCity("Budapest");
        mark.setTelephone("+36706007285");
        ownerService.save(mark);

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
