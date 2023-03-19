package stringexercisestwo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringExercisesTwo {
    public static void main(String[] args) {
        StringMethods strMethods = new StringMethods();
        System.out.println(strMethods.firstTwoChar("Java"));
        System.out.println(strMethods.countOfSubstring("hhasdh hhoolhh","hh"));
        System.out.println(strMethods.isPalindrome("abcba"));
        ArrayList<String> list=new ArrayList<>(Arrays.asList("however","order", "arr","maximize","about","are","language","are"));
        System.out.println(strMethods.aThreeChar(list));
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(5,9,8,2,7,1,4));
        System.out.println(strMethods.oddOrEven(numbers));
        System.out.println(strMethods.cezarDecoder("Ofaf nx ymj gjxy uwtlwfrnsl qfslzflj jajw"));
        System.out.println(strMethods.cezarCoder("Hello"));
        System.out.println(strMethods.commonSubSequence("Given two strings write a method that finds the longest common sub-sequence."
                                                        ,"Given two stringsf write a method that finds the longestt common subsequence."));
        System.out.println(strMethods.commonCharCount("faarteegsj","daatyteep"));
        System.out.println(strMethods.possiblyNestedRevers("foo(bar(baz))blim"));
    }
}
