package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog() {
        Dog dog = new Dog("Ritter", new Date(), 42);
        DogHouse dh = new DogHouse();
        Integer exp = dh.getNumberOfDogs() + 1;
        dh.add(dog);
        Integer noc = dh.getNumberOfDogs();
        Assert.assertEquals(exp, noc);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveID() {
        Dog dog = new Dog("Ritter", new Date(), 42);
        DogHouse dh = new DogHouse();
        dh.add(dog);
        Integer exp = dh.getNumberOfDogs() - 1;
        dh.remove(42);
        Integer noc = dh.getNumberOfDogs();
        Assert.assertEquals(exp, noc);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog() {
        Dog dog = new Dog("Ritter", new Date(), 42);
        DogHouse dh = new DogHouse();
        dh.add(dog);
        Integer exp = dh.getNumberOfDogs() - 1;
        dh.remove(dog);
        Integer noc = dh.getNumberOfDogs();
        Assert.assertEquals(exp, noc);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogByID() {
        Dog dog = new Dog("Ritter", new Date(), 42);
        DogHouse dh = new DogHouse();
        dh.add(dog);
        Dog ritter = dh.getDogById(42);
        String act = ritter.getName();
        Assert.assertEquals("Ritter", act);
    }
}
