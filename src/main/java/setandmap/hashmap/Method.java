package setandmap.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Method {
    /**
     * this method is print longest consecutive subsequence of integers in the array
     *
     * @param arr array of integer
     */
    public static int longestSubsequence(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        int count = 1;
        int result = 0;
        for (int i = 1; i < map.size(); i++) {
            if (map.get(i - 1) - map.get(i) == -1) {
                count++;
            } else {
                if (result < count) {
                    result = count;
                }
                count = 1;
            }
            if (result < count) {
                result = count;
            }
        }
        return result;
    }

    /**
     * return number of anagram pairs
     * @param str array of string
     * @return
     */
    public static int anagram(String[] str) {
        HashMap<Integer, char[]> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();
            Arrays.sort(ch);
            map.put(i, ch);
        }
        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < map.size(); j++) {
                if (Arrays.equals(map.get(i), map.get(j)) && i != j) {
                    count++;
                }
            }
        }
        return count;
    }
}
