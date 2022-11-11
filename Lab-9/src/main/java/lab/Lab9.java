package lab;

import java.util.Arrays;
import java.util.Scanner;

/*

Question #1 - Time complexity of this merge sort is O(m+n) as you are just combining them together and the sum of the
length and both arrays are traveresed and the same time.


 */


public class Lab9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size for Array 1: ");
        int size = sc.nextInt();
        int array1[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Int in index " + i);
            array1[i] = sc.nextInt();
        }
        System.out.println("Array 1: " + Arrays.toString(array1));

        System.out.print("Size for Array 2: ");
        size = sc.nextInt();
        int array2[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Int in index " + i);
            array2[i] = sc.nextInt();
        }
        System.out.println("Array 2: " + Arrays.toString(array2));

        int sorted[] = merge(array1, array2);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] merge(int[] array1, int[] array2) {
        //check corner case
        if (array1 == null) {
            return array2;
        }
        if (array2 == null) {
            return array1;
        }
        int[] res = new int[array1.length + array2.length];
        int i = 0, j = 0;
        while (i + j < res.length) {
            if (i < array1.length && (j >= array2.length || array1[i] > array2[j])) {
                res[i + j] = array1[i];
                i++;
                continue;
            }
            res[i + j] = array2[j];
            j++;

        }
        return res;

    }
}
