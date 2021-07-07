package io.zipcoder.polymorphism;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    ArrayList<Pet> petArrayList = new ArrayList<Pet>();

    public void init() {
        Integer numOfPets = getIntegerInput("How many pets do you have?");
        for (int i = 0; i < numOfPets; i++) {
            boolean validInput = false;
            String kindOfPet = "default";
            while (!validInput) {
                kindOfPet = getStringInput(String.format("What kind of pet is pet %d? \n Please enter dog, cat, or pigeon.", i));
                validInput = isValidPetType(kindOfPet);
            }
            String name = getStringInput("What is this pet's name?");
            addPet(createPet(kindOfPet, name));
        }
        System.out.println(getPetInfo());
    }

    public boolean isValidPetType(String pet) {
        switch (pet.toLowerCase().trim()) {
            case "dog":
            case "cat":
            case "pigeon":
                return true;
            default:
                return false;
        }
    }

    public Pet createPet(String kindOfPet, String name){
        switch (kindOfPet.toLowerCase().trim()) {
            case "dog" :
                return new Dog(name);
            case "cat" :
                return new Cat(name);
            case "pigeon" :
                return new Pigeon(name);
            default :
                return null;
        }
    }

    public Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter a positive integer.");
        }
        int userInput = scanner.nextInt();
        return userInput;
    }

    public String getStringInput(String prompt) { // use this to get boolean input too
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public void addPet(Pet p) {
        petArrayList.add(p);
    }

    public String getPetInfo() {
        StringBuilder sb = new StringBuilder();
        for (Pet p : petArrayList){
            sb.append(String.format("\n%s says %s", p.getName(), p.speak()));
        }
        return sb.toString();
    }
}
