package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
        Cat cat = new Cat("Max",new Date(),null);
        String expected = "Max";
        cat.setName( "Max" );
        String actual = cat.getName();
        Assert.assertEquals( expected,actual );
        }

    // TODO - Create tests for `speak`
    @Test
    public void speak(){
        Cat cat = new Cat( "Danny", new Date(),null );
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals( expected,actual );

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthdate(){
        Cat cat = new Cat( null,null,null );
        Date expected = new Date();
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        Assert.assertEquals( expected,actual );
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Cat cat = new Cat( null,null,null );
        int numberofMealsEaten = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        int expected = numberofMealsEaten + 1;
        Assert.assertEquals( expected,actual );

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getID(){
        Cat cat = new Cat( null,null,01234 );
        int expected = 01234;
        int actual = cat.getId();
        Assert.assertEquals( expected,actual );


    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
public void animal(){
        Cat cat = new Cat( null,null,null );
        boolean actual = cat instanceof Animal;
        Assert.assertTrue( actual );

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
 public void Mammal(){
        Cat cat = new Cat( null,null,null );
        boolean actual = cat instanceof Mammal;
        Assert.assertTrue( actual );
    }


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

}
