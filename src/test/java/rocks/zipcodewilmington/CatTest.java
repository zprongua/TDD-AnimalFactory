package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        Date expectedBD = new Date(1988, 1, 17);
        int expectedID = 42;
        String expectedName = "Shotgun";
        Cat cat = new Cat(expectedName, expectedBD, expectedID);
        String actual = cat.getName();
        Assert.assertEquals(expectedName, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        Date expectedBD = new Date(1988, 1, 17);
        int expectedID = 42;
        String expectedName = "Shotgun";
        Cat cat = new Cat(expectedName, expectedBD, expectedID);
        String actual = cat.speak();
        Assert.assertEquals("meow!", actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        Date BD = new Date(1988, 1, 17);
        int expectedID = 42;
        String Name = "Shotgun";
        Cat cat = new Cat(Name, BD, expectedID);
        Date expectedBD = new Date(1951, 6, 16);
        cat.setBirthDate(expectedBD);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expectedBD, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        Date expectedBD = new Date(1988, 1, 17);
        int expectedID = 42;
        String expectedName = "Shotgun";
        Food food = new Food();
        Cat cat = new Cat(expectedName, expectedBD, expectedID);
        Integer expectedFood = cat.getNumberOfMealsEaten() + 1;
        cat.eat(food);
        Integer actualFood = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedFood, actualFood);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        Date expectedBD = new Date(1988, 1, 17);
        int expectedID = 42;
        String expectedName = "Shotgun";
        Cat cat = new Cat(expectedName, expectedBD, expectedID);
        int actual = cat.getId();
        Assert.assertEquals(expectedID, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimal() {
        Date expectedBD = new Date(1988, 1, 17);
        int expectedID = 42;
        String expectedName = "Shotgun";
        Cat cat = new Cat(expectedName, expectedBD, expectedID);
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammal() {
        Date expectedBD = new Date(1988, 1, 17);
        int expectedID = 42;
        String expectedName = "Shotgun";
        Cat cat = new Cat(expectedName, expectedBD, expectedID);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
