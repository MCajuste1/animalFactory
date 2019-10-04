package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog() {
        Date todaysDate = new Date();
        Dog dog = AnimalFactory.createDog( "Dave", todaysDate );
        String actualName = dog.getName();
        Date birthDate = dog.getBirthDate();
        Assert.assertEquals( "Dave", actualName );
        Assert.assertEquals( todaysDate, birthDate );
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {
        Date todaysDate = new Date();
        Cat cat = AnimalFactory.createCat( "Mike", todaysDate );
        String actualName = cat.getName();
        Date birthDate = cat.getBirthDate();
        Assert.assertEquals( "Mike", actualName );
        Assert.assertEquals( todaysDate, birthDate );
    }
}