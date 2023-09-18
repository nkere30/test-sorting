package com.epam.rd.autotasks;

import org.junit.Test;

import java.util.Arrays;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected =  IllegalArgumentException.class)
    public void testNullCase(){
        int[] expected = null;
        sorting.sort(expected);
    }

    @Test
    public void testEmptyCase(){
        int[] expected = {};
        int expectedSize = 0;
        sorting.sort(expected);
        assertEquals(expected.length, expectedSize);
        Exception ex = null;
        try{
            sorting.sort(expected);
        }catch (Exception e){
            ex = e;
        }
        assertNull(ex);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] expected = {4};
        int expectedElement = expected[0];
        int expectedLength = 1;
        sorting.sort(expected);
        assertEquals(expected.length, expectedLength);
        assertEquals(expectedElement, expected[0]);
    }

    @Test
    public void testSortedArraysCase() {
        int[] actual = {5, 7, 9, 13, 27, 30};
        int [] expected = Arrays.copyOf(actual,actual.length);
        sorting.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testOtherCases() {
        int[] sampleArray = {3, 6, 1, 15, 5, 23, 24, 64, 45, 90, 3};
        int[] sortedArray = Arrays.copyOf(sampleArray,sampleArray.length);
        Arrays.sort(sortedArray);
        sorting.sort(sampleArray);
        assertArrayEquals(sortedArray, sampleArray);
    }
}