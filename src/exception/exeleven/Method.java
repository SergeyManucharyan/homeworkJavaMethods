package exception.exeleven;

public class Method{
    /**
     * this method reverses the given string
     * @param str
     * @return reversed string
     */
    public String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }

    /**
     * this method calculate vowels count in given string
     * @param str string
     * @return count of vowels
     */
    public int vowelCount(String str){
        int count=0;
        char[] ch=str.toCharArray();
        for (char c:ch) {
            if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u'){
                count++;
            }
        }
        return count;
    }
}