package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `void setName(String name)`
    Date expectedBD = new Date(2018, 2, 6);
    int expectedID = 42;
    String expectedName = "Ritter";
    Dog dog = new Dog(expectedName, expectedBD, expectedID);
    @Test
    public void testSetName() {
        String actual = dog.getName();
        Assert.assertEquals(expectedName, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        String actual = dog.speak();
        Assert.assertEquals("bark!", actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        Date expectedBD = new Date(1951, 6, 16);
        dog.setBirthDate(expectedBD);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expectedBD, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        Food food = new Food();
        Integer expectedFood = dog.getNumberOfMealsEaten() + 1;
        dog.eat(food);
        Integer actualFood = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedFood, actualFood);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        int actual = dog.getId();
        Assert.assertEquals(expectedID, actual);
    }
    //TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimal() {
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammal() {
        Assert.assertTrue(dog instanceof Mammal);
    }
}
