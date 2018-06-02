package nl.han.app.Lists;

import org.junit.Assert;
import org.junit.Test;

public class HANLinkedListTest {

    @Test
    public void insertFirstIntoLinkedListTest(){
        // Arrange
        HANLinkedList<Integer> sut = new HANLinkedList<Integer>();
        Integer valueToAdd = 10;
        Integer valueToAddFirst = 15;

        // Act
        sut.addFirst(valueToAdd);
        sut.addFirst(valueToAddFirst);

        // Assert
        Assert.assertEquals(valueToAddFirst, sut.get(0));
    }

    @Test
    public void deleteFirstOfLinkedListTest(){
        // Arrange
        HANLinkedList<Integer> sut = new HANLinkedList<Integer>();
        Integer valueToAdd = 10;
        Integer valueToAddFirst = 15;

        // Act
        sut.addFirst(valueToAddFirst);
        sut.addFirst(valueToAdd);
        sut.removeFirst();

        // Assert
        Assert.assertEquals(valueToAddFirst, sut.get(0));
    }

    @Test
    public void deleteRandomIndexFromLinkedListTest(){
        // Arrange
        HANLinkedList<Integer> sut = new HANLinkedList<Integer>();
        Integer valueToAdd = 10;
        Integer valueToAddFirst = 15;

        // Act
        sut.insert(0, valueToAddFirst);
        sut.insert(1, valueToAdd);
        sut.delete(1);

        // Assert
        Assert.assertEquals(valueToAddFirst, sut.get(0));
    }

    @Test
    public void insertIntoLinkedListTest(){
        // Arrange
        HANLinkedList<Integer> sut = new HANLinkedList<Integer>();
        Integer valueToAdd = 10;
        Integer valueToAddFirst = 15;

        // Act
        sut.addFirst(valueToAddFirst);
        sut.insert(1, valueToAdd);

        // Assert
        Assert.assertEquals(valueToAddFirst, sut.get(0));
        Assert.assertEquals(valueToAdd, sut.get(1));
    }
}