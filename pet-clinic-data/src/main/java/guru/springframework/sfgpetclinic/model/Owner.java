package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public class Owner extends Person {

    private Set<Pet> pets;
}
