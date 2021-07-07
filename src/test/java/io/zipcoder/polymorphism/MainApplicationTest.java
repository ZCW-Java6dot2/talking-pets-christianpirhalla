package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class MainApplicationTest {


@Test
    public void getIntegerInputTest(){ // for getting how many pets the user has
    //Given
    MainApplication app = new MainApplication();
    Integer expectedInt = 5;

    //When
    String input = expectedInt.toString();
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Integer actualInt = app.getIntegerInput("How many pets do you have?"); // The message to show the user when prompted for input is passed as an argument/parameter

    //Then
    Assert.assertEquals(expectedInt, actualInt);
}

@Test
    public void getStringInputTest(){ // for getting names and types of pets
    //Given
    MainApplication app = new MainApplication();
    String expectedString = "Dog";

    //When
    InputStream in = new ByteArrayInputStream(expectedString.getBytes());
    System.setIn(in);
    String actualString = app.getStringInput("What type of pet is this?"); // The message to show the user when prompted for input is passed as an argument/parameter

    //Then
    Assert.assertEquals(expectedString, actualString);
}

@Test
    public void getPetInfoTest(){
    //Given
    MainApplication app = new MainApplication();
    Dog dog = new Dog("Fido");
    Cat cat = new Cat("Felix");
    Pigeon pigeon = new Pigeon("Feathers");
    
    //MainApplication will hold an ArrayList<Pet> that you can add to using addPet
    app.addPet(dog);
    app.addPet(cat);
    app.addPet(pigeon);

    String expectedString =
            "\nFido says Bark!" + "\nFelix says Meow!" + "\nFeathers says Coo!";

    //When
    String actualString = app.getPetInfo(); //getPetInfo should return a string like above

    //Then
    Assert.assertEquals(expectedString, actualString);



}


}
