package stringexercisestwo;

import java.util.ArrayList;

public class StringMethods {

    /**
     * @param s String
     * @return string first two character
     */
    public String firstTwoChar(String s) {
        if (s.charAt(0)=='o') {
            if (s.charAt(1) == 'z') {
                return (s.substring(0, 2));
            } else {
                return (s.charAt(0)+"");
            }
        }
        return "String is so short";
    }

    /**
     * @param str   string
     * @param token substring
     * @return count the number of token in the given string
     */
    public int countOfSubstring(String str, String token) {
        int count = 0;
        if (token.length() != 2) {
            System.out.println("token length must be two");
        } else {
            StringBuilder sb = new StringBuilder();
            char[] charOfString = str.toCharArray();
            for (int i = 1; i < charOfString.length; i++) {
                sb.append(charOfString[i - 1]).append(charOfString[i]);
                if (sb.toString().equals(token)) {
                    count++;
                }
                sb.setLength(0);
            }
        }
        return count;
    }

    /**
     * @param str string
     * @return if string is palindrome return true else return false
     */
    public boolean isPalindrome(String str) {
        if (str.trim().length() == 0) {
            System.out.println("String is empty");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString().equals(str);
    }

    public ArrayList<String> aThreeChar(ArrayList<String> list) {
        ArrayList<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 3 && s.charAt(0) == 'a') {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

    public ArrayList<String> oddOrEven(ArrayList<Integer> numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                list.add("e" + num);
            } else {
                list.add("o" + num+',');
            }
        }
        return list;
    }

    public String cezarDecoder(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch >= 65 && ch <= 90) {
                if (ch - 5 < 65) {
                    sb.append((char) (90 - (5 - (ch - 64))));
                } else {
                    sb.append((char) (ch - 5));
                }
            } else if (ch >= 97 && ch <= 122) {
                if (ch - 5 < 97) {
                    sb.append((char) (122 - (5 - (ch - 96))));
                } else {
                    sb.append((char) (ch - 5));
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String cezarCoder(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch >= 65 && ch <= 90) {
                if (ch + 5 > 90) {
                    sb.append((char) (65 + (ch + 5 - 90)));
                } else {
                    sb.append((char) (ch + 5));
                }
            } else if (ch >= 97 && ch <= 122) {
                if (ch + 5 > 122) {
                    sb.append((char) (97 + (ch + 5 - 123)));
                } else {
                    sb.append((char) (ch + 5));
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String largestPalindrome(String s) {
        String pol = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            int lastChar = words[i].charAt(words[i].length() - 1);
            if (lastChar < 65 || lastChar > 90 && lastChar < 97 || lastChar > 122) {
                words[i] = words[i].substring(0, words[i].length() - 1);
            }
        }
        for (String w : words) {
            if (isPalindrome(w)) {
                if (w.length() > pol.length()) {
                    pol = w;
                }
            }
        }
        if (pol.length() == 0) {
            return "Palindrome words not found";
        }

        return pol;
    }

    /**
     * @param strOne String
     * @param strTwo string
     * @return largest subsequence of two string
     */
    public String commonSubSequence(String strOne, String strTwo) {
        StringBuilder sb = new  StringBuilder();
        StringBuilder result = new StringBuilder();
        String[] arrOne=strOne.split(" ");
        String[] arrTwo=strTwo.split(" ");
        for (int i=0;i<arrOne.length;i++) {
            for (int j=0;j<arrTwo.length;j++) {
                if (arrOne[i].equals(arrTwo[j])) {
                    sb.append(arrOne[i]).append(" ");
                    if (i + 1 < arrOne.length) {
                        i++;
                    }
                }
            }
                if(result.length()<sb.length()){
                    result.setLength(0);
                    result.append(sb);
                    sb.setLength(0);
                }
        }
        return result.toString();
    }
    public int commonCharCount(String sOne,String sTwo){
        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder();
        int count=0;
        for (int i = 0; i < sOne.length(); i++) {
            if(!sbOne.toString().contains(sOne.charAt(i)+"")){
                sbOne.append(sOne.charAt(i));
            }
        }
        for (int i = 0; i < sTwo.length(); i++) {
            if(!sbTwo.toString().contains(sTwo.charAt(i)+"")){
                sbTwo.append(sTwo.charAt(i));
            }
        }
        for (int i = 0; i < sbOne.length(); i++) {
            if(sbTwo.toString().contains(sbOne.charAt(i)+"")){
                count++;
            }
        }
        return count;
    }
    public static boolean checkParentheses(String s){
        char[] chars=s.toCharArray();
        int openParentheses=0,closeParentheses=0;
        for (char ch : chars) {
            if (ch == '(') {
                openParentheses++;
            } else if (ch == ')') {
                closeParentheses++;
            }
        }if(openParentheses==0||closeParentheses!=openParentheses){
            return false;
        }
        return true;
    }
    public String possiblyNestedRevers(String s){
        StringBuilder sb=new StringBuilder();
        if(!checkParentheses(s)){
            return "Incorrect input";
        }
        int endPoint=0;
        while (s.contains("(")){
            char[] ch=s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]==')'){
                    endPoint=i;
                    int step=0;
                    for(int j=endPoint;j>=0;j--){
                        step++;
                        if (ch[j]=='(') {
                            sb.append(s,i-step+2,i).reverse();
                            s=s.substring(0,i-step+1)+sb+s.substring(i+1);
                            sb.setLength(0);
                            break;
                        }
                    }break;
                }
            }
        }
        return s;
    }
}


