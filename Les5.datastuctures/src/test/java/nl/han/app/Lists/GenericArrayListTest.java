package nl.han.app.Lists;

import nl.han.app.Lists.Interfaces.IGenericArrayList;
import org.junit.Assert;
import org.junit.Test;

public class GenericArrayListTest {

    @Test
    public void AddToArraylistTest(){
        // Arrange
        IGenericArrayList<Integer> sut = new GenericArrayList<Integer>();
        Integer valueToAdd = 10;

        // Act
        sut.add(10);

        // Assert
        Assert.assertEquals(valueToAdd, sut.get(0));
    }

    @Test
    public void AddToGenericArrayListSpecificIndexTest(){
        // Arrange
        IGenericArrayList<Integer> sut = new GenericArrayList<Integer>();
        int valueToAdd = 10;
        int index = 5;

        // Act
        sut.set(index, valueToAdd);

        // Assert
        Assert.assertEquals((Integer)valueToAdd, sut.get(index));
    }

    @Test
    public void AddToGenericArrayListLargerSpecificIndexTest(){
        // Arrange
        IGenericArrayList<Integer> sut = new GenericArrayList<Integer>();
        int valueToAdd = 10;
        int index = 15;

        // Act
        sut.set(index, valueToAdd);

        // Assert
        Assert.assertEquals((Integer)valueToAdd, sut.get(index));
    }
}