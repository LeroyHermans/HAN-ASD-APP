package nl.han.app.Datastructures;

import org.junit.Assert;
import org.junit.Test;

public class HANStackTest {

    @Test
    public void addToStackTest(){
        // Arrange
        HANStack<Integer> sut = new HANStack<Integer>();
        Integer val1 = 1;
        Integer val2 = 2;

        // Act
        sut.push(val1);
        sut.push(val2);

        // Assert
        Assert.assertEquals(val2, sut.top());
    }

    @Test
    public void popFromStackTest(){
        // Arrange
        HANStack<Integer> sut = new HANStack<Integer>();
        Integer val1 = 1;
        Integer val2 = 2;

        sut.push(val1);
        sut.push(val2);

        // Act
        sut.pop();

        // Assert
        Assert.assertEquals(val1, sut.top());
    }

    @Test
    public void stackSizeTest(){
        // Arrange
        HANStack<Integer> sut = new HANStack<Integer>();
        Integer val1 = 1;
        Integer val2 = 2;

        sut.push(val1);
        sut.push(val2);

        // Act
        int actual = sut.getSize();

        // Assert
        Assert.assertEquals(2, actual);
    }
}