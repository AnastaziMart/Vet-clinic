package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Scanner;

public class PetService {

    private static final String DOG_TYPE = "dog";

    private static final String CAT_TYPE = "cat";

    private static final String HEALTH_STATE = "stateOfHealth";

    public Pet registerNewPet() {
        Pet pet = null;

        System.out.print("Type (dog / cat): ");
        String type = Main.SCANNER.nextLine();


        if (DOG_TYPE.equals(type) || CAT_TYPE.equals(type)) {
            pet = buildPet(type);
        } else {
            System.out.println("Unknown pet type: " + type);
        }

        return pet;
    }


    private Pet buildPet(String type) {
        Pet pet = type.equals(CAT_TYPE) ? new Cat() : new Dog();
        pet.setType(type);

        System.out.print("Age: ");
        pet.setAge(Main.SCANNER.nextLine());

        System.out.print("Name: ");
        pet.setName(Main.SCANNER.nextLine());

        System.out.print("Sex (male / female): ");
        pet.setSex(Main.SCANNER.nextLine());


        if (type.equals(DOG_TYPE)) {
            System.out.print("Size (XS / S / M / L / XL): ");
            String size = Main.SCANNER.nextLine();
            ((Dog) pet).setSize(Dog.Size.valueOf(size));
        }


        if (type.equals(HEALTH_STATE)) {
            System.out.println("SATISFACTORY_CONDITION(1),\n" +
                    "            MODERATE_CONDITION(2),\n" +
                    "            EXTREMELY_SERIOUS_CONDITION(3),\n" +
                    "            TERMINAL_STATE(4),\n" +
                    "            UNKNOWN(5);");


        }
        

        return pet;
    }
}
