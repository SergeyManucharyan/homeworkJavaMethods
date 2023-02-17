package stringandstringbuilder;

import java.util.Scanner;

public class StringMethods {
//    1.  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով.

    /**
     * @param strOne string
     * @param strTwo string
     *               print concatenated string with input parameters
     */
    public void stringConcat(String strOne, String strTwo) {
        System.out.println(strOne + strTwo);
    }

    /**
     * @param numOne integer number
     * @param numTwo integer number
     * @param s      string
     *               prints concatenated string with input parameters
     */
    public void stringConcat(int numOne, int numTwo, String s) {
        System.out.println(numOne + numTwo + s);
    }

    /**
     * @param strOne string
     * @param numOne integer number
     * @param strTwo string
     *               prints concatenated string with input parameters
     */
    public void stringConcat(String strOne, int numOne, String strTwo) {
        System.out.println(strOne + numOne + strTwo);
    }

    /**
     * @param strOne string
     * @param numOne integer number
     * @param numTwo integer number
     * @param strTwo string
     *               prints concatenated string with input parameters
     */
    public void stringConcat(String strOne, int numOne, int numTwo, String strTwo) {
        System.out.println(strOne + numOne + numTwo + strTwo);
    }

    /**
     * @param strOne string
     * @param strTwo string
     *               print concatenated string with input parameters
     */
    public void stringBuilderConcat(String strOne, String strTwo) {
        StringBuilder sb = new StringBuilder();
        sb.append(strOne);
        sb.append(strTwo);
        System.out.println(sb);
    }

    /**
     * @param numOne integer number
     * @param numTwo integer number
     * @param s      string
     *               prints concatenated string with input parameters
     */
    public void stringBuilderConcat(int numOne, int numTwo, String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(numOne);
        sb.append(numTwo);
        sb.append(s);
        System.out.println(sb);
    }

    /**
     * @param strOne string
     * @param numOne integer number
     * @param strTwo string
     *               prints concatenated string with input parameters
     */
    public void stringBuilderConcat(String strOne, int numOne, String strTwo) {
        StringBuilder sb = new StringBuilder();
        sb.append(strOne);
        sb.append(numOne);
        sb.append(strTwo);
        System.out.println(sb);
    }

    /**
     * @param strOne string
     * @param numOne integer number
     * @param numTwo integer number
     * @param strTwo string
     *               prints concatenated string with input parameters
     */
    public void stringBuilderConcat(String strOne, int numOne, int numTwo, String strTwo) {
        StringBuilder sb = new StringBuilder();
        sb.append(strOne);
        sb.append(numOne);
        sb.append(numTwo);
        sb.append(strTwo);
        System.out.println(sb);
    }
//    2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal

    /**
     * @param str string
     * @return returns a String that starts with a new line after each empty character
     */
    public String newlineString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append('\n');
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
//    3․ Գրել method (reverse), որը  շուռ է տալիս String.

    /**
     * @param s string
     * @return reversed string
     */
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
//    4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.

    /**
     * @param line  string
     * @param token substring
     * @return returns the number of times the token substring occurs in the given text
     */
    public int occurSubstring(String line, String token) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            sb.append(line.charAt(i));
            sb.append(line.charAt(i + 1));
            if (sb.toString().equals(token)) {
                count++;
            }
            sb.delete(0, sb.length());
        }
        return count;
    }
//    5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված

    /**
     * @param str string
     * @return return uppercase string
     */
    public String upperCase(String str) {
        StringBuilder sb = new StringBuilder(str.toUpperCase());
        return sb.toString();
    }

    //    6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի
//    երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    public String twentyChar() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string...");
        String str = sc.nextLine();
        if (str.length() > 20) {
            return "Wrong input string length must be less or equal 20 character";
        } else {
            sb.append(str);
            while (sb.length() < 20) {
                sb.append("*");
            }
        }
        return sb.toString();
    }
//7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները.

    /**
     * @param str string
     * @return string without 'a' character
     */

    public String removeChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (char el : str.toCharArray()) {
            if (el != 'a') {
                sb.append(el);
            }
        }
        return sb.toString();
    }

    //    8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.

    /**
     * @param str string
     * @return string with replaced character
     */
    public String replaceChar(String str) {
        String replaced = "";
        for (char el : str.toCharArray()) {
            if (el == 'a') {
                replaced += "*";
            } else {
                replaced += el;
            }
        }
        return replaced;
    }
//    9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.

    /**
     * @param sb StringBuilder
     * @return longest word
     */
    public String largestWord(StringBuilder sb) {
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                count++;
            }
        }
        String[] strArray = new String[count + 1];
        int index = 0, arrIndex = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                String s = sb.substring(index, i);
                char ch = s.charAt(s.length() - 1);
                if (!(ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90)) {
                    s = s.substring(0, s.length() - 1);
                }
                strArray[arrIndex] = s;
                index = i + 1;
                arrIndex++;
            }
        }
        strArray[strArray.length - 1] = sb.substring(index, sb.length());
        int maxlength = 0, maxIndex = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxlength) {
                maxlength = strArray[i].length();
                maxIndex = i;
            }
        }
        return (strArray[maxIndex]);
    }

    //    10․ Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը

    /**
     *
     * @param str string
     * @param token index
     * @return return the index at which the symbol was first encountered
     */
    public int indexOf(String str, String token) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if ((sb.charAt(i) == token.charAt(0))) {
                return i;
            }
        }
        return -1;
    }

//    11․ Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը, օգտագործելով String. Նույնը խնդիրը  StringBuilder-ով.

    /**
     *
     * @param str string
     * @param arg int index
     * @return finds and return the substring from the beginning of the given string up to the given index
     */
    public String subString(String str, int arg) {
        String result = "";
        if (arg < 1) {
            return "Wrong input argument must be higher then 1";
        }
        if (arg > str.length() - 1) {
            return "argument is out of bounds";
        }
        for (int i = 0; i <= arg; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public String subStringStringBuilder(StringBuilder str, int arg) {
        StringBuilder result = new StringBuilder();
        if (arg < 1) {
            return "Wrong input argument must be higher then 1";
        }
        if (arg > str.length() - 1) {
            return "argument is out of bounds";
        }
        for (int i = 0; i < arg; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

//12. Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․

    /**
     *
     * @param s String
     *          checks whether the given String parameter is empty and not null
     */

    public void isNullOrEmpty(String s) {
        if (s == null) {
            System.out.println("String is null");
        } else if (s.length() > 0) {
            System.out.println("String is neither null nor empty");
        } else {
            System.out.println("String is empty");
        }
        System.out.println();
    }
//    13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը ․

    /**
     *
     * @param str string
     * splits the sentence by ',' and finds the longest word.
     */
    public void largestSubstring(String str){
        StringBuilder sb=new StringBuilder();
        boolean bool=str.charAt(str.length()-1)==',';
        int count=0;
        for (int i = 0;i<str.length();i++) {
            if(str.charAt(i)==','){
                count++;
            }
        }
        if(!bool){
            count++;
        }
        String[] s=new String[count];
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=','){
                sb.append(str.charAt(i));
            }else{
                s[index]=sb.toString();
                index++;
                sb.setLength(0);
            }
        }
        if(!bool) {
            s[index] = sb.toString();
        }
        int largest=0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].length()>s[largest].length()){
                largest=i;
            }
        }
        System.out.println(s[largest]);
    }
}

