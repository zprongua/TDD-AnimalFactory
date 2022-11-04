package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat() {
        Cat cat = new Cat("Steve", new Date(), 42);
        CatHouse ch = new CatHouse();
        Integer exp = ch.getNumberOfCats() + 1;
        ch.add(cat);
        Integer noc = ch.getNumberOfCats();
        Assert.assertEquals(exp, noc);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveID() {
        Cat cat = new Cat("Steve", new Date(), 42);
        CatHouse ch = new CatHouse();
        ch.add(cat);
        Integer exp = ch.getNumberOfCats() - 1;
        ch.remove(42);
        Integer noc = ch.getNumberOfCats();
        Assert.assertEquals(exp, noc);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        Cat cat = new Cat("Steve", new Date(), 42);
        CatHouse ch = new CatHouse();
        ch.add(cat);
        Integer exp = ch.getNumberOfCats() - 1;
        ch.remove(42);
        Integer noc = ch.getNumberOfCats();
        Assert.assertEquals(exp, noc);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatByID() {
        Cat cat = new Cat("Steve", new Date(), 42);
        CatHouse ch = new CatHouse();
        ch.add(cat);
        Cat steve = ch.getCatById(42);
        String act = steve.getName();
        Assert.assertEquals("Steve", act);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        Cat cat = new Cat("Steve", new Date(), 42);
        CatHouse ch = new CatHouse();
        ch.add(cat);
        Integer noc = ch.getNumberOfCats();
        Integer exp = 1;
        Assert.assertEquals(exp, noc);
    }
}
