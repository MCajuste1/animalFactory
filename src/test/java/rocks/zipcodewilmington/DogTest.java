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
    @Test
    public void setName() {
        Dog dog = new Dog( "Rex", new Date(), null );
        String expected = "Rex";
        dog.setName( "Rex" );
        String actual = dog.getName();
        Assert.assertEquals( expected, actual );
    }


    // TODO - Create tests for `speak`
    @Test
    public void speak() {
        Dog dog = new Dog( "Shine", new Date(), null );
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals( expected,actual );
    }

        // TODO - Create tests for `setBirthDate(Date birthDate)`
        @Test
        public void setBirthdate(){
            Dog dog1 = new Dog( null,null,null );
            Date expected1 = new Date();
            dog1.setBirthDate(expected1);
            Date actual1 = dog1.getBirthDate();
            Assert.assertEquals( expected1,actual1 );
        }


        // TODO - Create tests for `void eat(Food food)`
        @Test
        public void eat(){
            Dog dog = new Dog( null,null,null );
            int numberofMealsEaten = dog.getNumberOfMealsEaten();
            dog.eat(new Food());
            int actual = dog.getNumberOfMealsEaten();
            int expected = numberofMealsEaten + 1;
            Assert.assertEquals( expected,actual );

        }

        // TODO - Create tests for `Integer getId()`
        @Test
        public void getID(){
            Dog dog = new Dog( null,null,01234 );
            int expected = 01234;
            int actual = dog.getId();
            Assert.assertEquals( expected,actual );


        }
        // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
        @Test
        public void animal(){
            Dog dog = new Dog( null,null,null );
            boolean actual = dog instanceof Animal;
            Assert.assertTrue( actual );

        }
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void Mammal(){
            Dog dog = new Dog( null,null,null );
            boolean actual = dog instanceof Mammal;
            Assert.assertTrue( actual );
        }
    }
