package algoritms.mergesort;

import java.util.Arrays;

public class MergeSort {

    private int[] merge(int[] first, int[] second) {
        int totalElements = first.length + second.length;
        var result = new int[totalElements];
        var j = 0;
        var k = 0;

        for (var i = 0; i < totalElements; i++) {
            boolean firstDone = j >= first.length;
            boolean secondDone = k >= second.length;
            if (!firstDone && (secondDone || (first[j] < second[k]))) {
                result[i] = first[j];
                j++;
            } else {
                result[i] = second[k];
                k++;
            }
        }
        return result;
    }

    public int[] sort(int[] arrayToSort) {
        if (arrayToSort.length < 2)
            return arrayToSort;

        var mid = arrayToSort.length / 2;
        var a = sort(Arrays.copyOfRange(arrayToSort, 0, mid));
        var b = sort(Arrays.copyOfRange(arrayToSort, mid, arrayToSort.length));
        return merge(a, b);
    }
}
