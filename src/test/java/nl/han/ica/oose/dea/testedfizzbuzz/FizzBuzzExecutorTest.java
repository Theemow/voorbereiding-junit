package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzExecutorTest {

    @Test
    void executeWithValidIntTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(18);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(250);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(330);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}