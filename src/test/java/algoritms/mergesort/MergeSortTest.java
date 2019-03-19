package algoritms.mergesort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergeSortTest {

    private MergeSort mergesort = new MergeSort();

    @Test
    public void emptyArray() {
        var emptyArray = new int[0];
        var expected = new int[0];
        var actual = mergesort.sort(emptyArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWithOne() {
        var arrayWithOne = new int[] { 1 };
        var expected = new int[] { 1 };
        var actual = mergesort.sort(arrayWithOne);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWithTwoSorted() {
        var arrayWithTwoSorted = new int[] { 1, 2 };
        var expected = new int[] { 1, 2 };
        var actual = mergesort.sort(arrayWithTwoSorted);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWithTwoUnsorted() {
        var arrayWithTwoUnsorted = new int[] { 2, 1 };
        var expected = new int[] { 1, 2 };
        var actual = mergesort.sort(arrayWithTwoUnsorted);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWithOddNumber() {
        var arrayWithOddNumber = new int[] { 2, 1, 11, 4, 5 };
        var expected = new int[] { 1, 2, 4, 5, 11 };
        var actual = mergesort.sort(arrayWithOddNumber);
        assertArrayEquals(expected, actual);
    }

}
