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

    /**
     *
     * @param list of string
     * @return returns a list of all strings that start with the letter 'a'
     * (lower case) and have exactly 3 letters
     */
    public ArrayList<String> aThreeChar(ArrayList<String> list) {
        ArrayList<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 3 && s.charAt(0) == 'a') {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

    /**
     *
     * @param list of numbers
     * @return Each element should be preceded by the letter 'e' if the number
     * is even, and preceded by the letter 'o' if the number is odd. For example, if
     * the input list is (3,44), the output should be 'o3,e44'
     */
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

    /**
     *Caesar used to communicate securely with his generals.
     * Each letter is replaced by another letter N positions down in
     * English alphabet. For example, to rotate by 5, the letter "c" would be
     * changed to "h". In the case of "z", the alphabet is rotated and it turns into
     * "d". Implement a decoder for a Caesar cipher where N = 5
     * @param str encrypted code string
     * @return decrypted string
     */
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

    /**
     *
     * @param str decrypted string
     * @return encrypted string
     */
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

    /**
     *
     * @param sOne String
     * @param sTwo String
     * @return   number of common characters
     */
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

    /**
     * check parentheses
     * @param s string
     * @return true if parentheses in legal position
     */
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

    /**
     *Write a function that reverses characters in (possibly nested) parentheses in
     *   the input string. Input strings will always be well-formed with matching ()s
     * @param s string
     * @return reversed String
     */
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


