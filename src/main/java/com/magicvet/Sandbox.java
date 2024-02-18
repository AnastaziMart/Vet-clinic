package main.java.com.magicvet;

import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.Size.M),
                new Dog(Dog.Size.S),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XS),
                new Dog(Dog.Size.S)
        };
        Pet[] pets = {
                new Cat("cat", "female", "5", "Misty", "Anastasia Martus"),
                new Dog("dog", "female", "10", "Dora", "Inna Ponomarova"),
                new Cat("cat", "male", "3", "Mars", "Olga Kostenko"),
                new Dog("dog", "male", "7", "Shrek", "Julia Markina")

        };



        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().getValue() - o2.getSize().getValue();
            }
        });

        for (Dog dog : dogs) {
            System.out.println(dog.getSize());
        }
        System.out.println();

        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet pet1, Pet pet2) {
                return Integer.parseInt(pet1.getAge())
                        - Integer.parseInt(pet2.getAge());
            }
        });
        for (Pet pet : pets) {
            System.out.println(pet.getAge());
        }
        System.out.println();

        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet pet1, Pet pet2) {
                return pet1.getName().charAt(0) - pet2.getName().charAt(0);
            }
        });
        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }

    }
}
