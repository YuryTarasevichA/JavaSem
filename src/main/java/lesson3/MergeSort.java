package lesson3;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a;
        }

        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, mid, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, a);

        return a;
    }

    private static void merge(int[] left, int[] right, int[] a) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
