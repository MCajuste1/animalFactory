package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        Dog dog = new Dog(null,null,01234);
        DogHouse.add( dog);
        Dog acutal = DogHouse.getDogById( 01234 );
        Assert.assertEquals( dog,acutal );

    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeTest(){
        Dog dog = new Dog( null,null,0246 );
        DogHouse.add( dog );
        DogHouse.remove( 0246 );
        Dog actual = DogHouse.getDogById( 0246 );
        Assert.assertNull(actual );

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest1(){
        Dog dog = new Dog( null,null,01357 );
        DogHouse.add( dog );
        DogHouse.remove( 01357 );
        Dog actual = DogHouse.getDogById( 01357 );
        Assert.assertNull( actual );
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void DogById(){
        Dog dog = new Dog( null,null,014);
        DogHouse.add( dog );
        Dog actual = DogHouse.getDogById( 014 );
        Assert.assertEquals( dog,actual );
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void NumberofDogs(){
        Dog dog = new Dog( null,null,null);
        int numberofDogs = DogHouse.getNumberOfDogs();
        DogHouse.add( dog );
        int expected = numberofDogs +1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals( expected,actual );
    }

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
}
