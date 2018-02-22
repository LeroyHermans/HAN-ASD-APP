package nl.han.app.Algorithms;

import nl.han.app.Interfaces.ISorter;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    private ISorter<Integer> sut = new InsertionSort<Integer>();

    @Test
    public void sortTest() {
        // arrange
        Integer[] input = new Integer[]{8, 1, 4, 9, 6, 3, 5, 2, 7, 0};
        Integer[] expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // act
        Integer[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, expected);
    }

    @Test
    public void sortEmptyArrayTest() {
        // arrange
        Integer[] input = new Integer[]{};

        // act
        Integer[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, new Integer[]{});
    }

    @Test
    public void sortSameValuesArrayTest() {
        // arrange
        Integer[] input = new Integer[]{1, 1, 1, 1, 1, 1};
        Integer[] expected = new Integer[]{1, 1, 1, 1, 1, 1};
        // act
        Integer[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, expected);
    }

    @Test
    public void sortReverseArrayTest() {
        // arrange
        Integer[] input = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // act
        Integer[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, expected);
    }
}