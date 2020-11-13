package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PigeonTest { // My third pet (my dad breeds pigeons)

    @Test
    public void testConstructor(){
        //Given
        String expectedName = "Pombo";

        //When
        Pigeon pigeon = new Pigeon(expectedName);
        String actualName = pigeon.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSpeak(){
        //Given
        String expectedSpeak = "Coo!";

        //When
        Pigeon pigeon = new Pigeon("Pigeon name"); // the name doesn't matter, I just need a pigeon for this test
        String actualSpeak = pigeon.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }

    @Test
    public void testSetName(){
        //Given
        String expectedName = "Paloma";
        Pigeon pigeon = new Pigeon("Dumb name");
        Pigeon.setName(expectedName);

        //When
        String actualName = pigeon.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }

}
