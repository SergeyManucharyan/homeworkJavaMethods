package generics;

import java.util.Arrays;

/**
 * Write a generic method to exchange the positions of two different elements in an
 * array
 */
public class ExchangePosition {
    public static void main(String[] args) {
        Integer[] arr = {1, 9, 8, 7, 6};
        String[] str = {"aaa", "bbb", "ccc"};
        System.out.println(Arrays.toString(exchange(arr, 9, 5)));
        System.out.println(Arrays.toString(exchange(str, "aaa", "xxx")));
    }

    public static <T> T[] exchange(T[] arr, T el1, T el2) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(el1)) {
                arr[i] = el2;
                break;
            }
        }
        return arr;
    }
}
