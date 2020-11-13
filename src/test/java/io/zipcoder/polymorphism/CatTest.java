package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest(){
        //Given
        String expectedName = "Kitkat";

        //When
        Cat cat = new Cat(expectedName);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        //Given
        String expectedSpeak = "Meow!";

        //When
        Cat cat = new Cat("CatName"); // The name doesn't matter, I just need a cat for this test
        String actualSpeak = cat.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);


    }

    @Test
    public void setNameTest(){
        //Given
        Cat cat = new Cat("Dumb name");
        String expectedName = "Felix";
        cat.setName(expectedName);

        //When
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

}
