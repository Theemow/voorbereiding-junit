package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest(){
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzTest(){
        // Act
        var testValue = sut.execute(18);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzTest(){
        // Act
        var testValue = sut.execute(250);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzTest(){
        // Act
        var testValue = sut.execute(330);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}