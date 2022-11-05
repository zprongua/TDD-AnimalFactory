package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    AnimalFactory af = new AnimalFactory();
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        String expName = "Ritter";
        Date date = new Date();
        Dog dog = af.createDog(expName, date);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        String expName = "Sheba";
        Date date = new Date();
        Cat cat = af.createCat(expName, date);
        String actName = cat.getName();
        Assert.assertEquals(expName, actName);
    }
}
