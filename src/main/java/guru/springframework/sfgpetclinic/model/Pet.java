package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet {

    private PetType petType;
    private Owner petTypeOwner;
    private LocalDate birthDate;

}
