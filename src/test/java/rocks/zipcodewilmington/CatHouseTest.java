package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
        Cat cat = new Cat(null,null,2345);
        CatHouse.add( cat);
        Cat acutal = CatHouse.getCatById( 2345 );
        Assert.assertEquals( cat,acutal );

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest(){
        Cat cat = new Cat( null,null,3456 );
        CatHouse.add( cat );
        CatHouse.remove( 3456 );
        Cat actual = CatHouse.getCatById( 3456 );
        Assert.assertNull(actual );

    }
    // TODO - Create tests for `void remove(Cat cat)`


    @Test
    public void removeTest1(){
        Cat cat = new Cat( null,null,4567 );
        CatHouse.add( cat );
        CatHouse.remove( 4567 );
        Cat actual = CatHouse.getCatById( 4567);
        Assert.assertNull( actual );
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void CatById(){
        Cat cat = new Cat( null,null,789);
        CatHouse.add( cat );
        Cat actual = CatHouse.getCatById( 789);
        Assert.assertEquals( cat,actual );
    }
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void NumberofCats(){
        Cat cat = new Cat( null,null,null);
        int numberofCats = CatHouse.getNumberOfCats();
        CatHouse.add( cat );
        int expected = numberofCats +1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals( expected,actual );
    }
}
