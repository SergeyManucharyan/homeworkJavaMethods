package setandmap.hashmap;

public class MethodRunner {
    public static void main(String[] args) {
        int[]arr ={1,2,3,5,6,7,0,1,9,10,11,12,13,14};
        String[] s={"dog", "god", "cat", "act", "mice"};
        System.out.println(Method.longestSubsequence(arr));
        System.out.println(Method.anagram(s));
    }
}
