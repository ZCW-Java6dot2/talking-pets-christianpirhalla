package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void constructorTest(){
        //Given
        String expectedName = "Fido";

        //When
        Dog dog = new Dog(expectedName);
        String actualName = dog.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        //Given
        String expectedSpeak = "Bark!";

        //When
        Dog dog = new Dog("DogName"); // The name doesn't matter, I just need a dog for this test
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void setNameTest(){
        //Given
        String expectedName = "Cubbie";
        Dog dog = new Dog("Dumb name");

        //When
        dog.setName(expectedName);
        String actualName = dog.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

}
