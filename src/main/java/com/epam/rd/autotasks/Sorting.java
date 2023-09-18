package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.Objects;

public class Sorting {
    public void sort(int[] array) {
        if(Objects.isNull(array)) throw new IllegalArgumentException();
        Arrays.sort(array);
    }
}
