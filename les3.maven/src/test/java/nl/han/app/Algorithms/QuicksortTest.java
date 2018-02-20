package nl.han.app.Algorithms;

import nl.han.app.Interfaces.ISort;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuicksortTest {

    private ISort sut = new Quicksort();

    @Test
    public void sortTest() {
        // arrange
        int[] input = new int[]{8, 1, 4, 9, 6, 3, 5, 2, 7, 0};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // act
        int[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, expected);
    }

    @Test
    public void sortEmptyArrayTest() {
        // arrange
        int[] input = new int[]{};

        // act
        int[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, new int[]{});
    }

    @Test
    public void sortSameValuesArrayTest() {
        // arrange
        int[] input = new int[]{1, 1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 1, 1, 1, 1, 1};
        // act
        int[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, expected);
    }

    @Test
    public void sortReverseArrayTest() {
        // arrange
        int[] input = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // act
        int[] result = sut.sort(input);

        // assert
        assertArrayEquals(result, expected);
    }
}