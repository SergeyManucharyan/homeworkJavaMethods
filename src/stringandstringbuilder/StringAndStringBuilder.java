package stringandstringbuilder;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        StringMethods str = new StringMethods();
        StringBuilder sb =new StringBuilder("We are living in an yellow submarine. We don't have anything");
        StringBuilder st=new StringBuilder();
//        1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
//        Նույնը  խնդիրը  StringBuilder-ով.
        str.stringConcat("hello", "JAVA");
        str.stringConcat(1, 2, "JAVA");
        str.stringConcat("hello", 5, "JAVA");
        str.stringConcat("hello", 5, 6, "JAVA");
        str.stringBuilderConcat("hello", "JAVA");
        str.stringBuilderConcat(1, 2, "JAVA");
        str.stringBuilderConcat("hello", 5, "JAVA");
        str.stringBuilderConcat("hello", 5, 6, "JAVA");
//        2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal
        System.out.println(str.newlineString("We are living in"));
//        3․ Գրել method (reverse), որը  շուռ է տալիս String.
        System.out.println(str.reverse("sample"));
//        4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
        System.out.println(str.occurSubstring("We are living in an yellow submarine. We don't  have anything", "in"));
//        5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված
        System.out.println(str.upperCase("hello world"));
//        System.out.println(str.twentyChar());
//        7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները.
        System.out.println(str.removeChar("We are living in an yellow submarine. We don't have anything"));
//    8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.

        System.out.println(str.replaceChar("We are living in an yellow submarine. We don't  have anything"));
        System.out.println(str.largestWord(sb));
        System.out.println(str.indexOf("submarine","m"));
        System.out.println(str.subString("hello",5));
        st.append("JAVA");
        System.out.println(str.subStringStringBuilder(st,1));
        str.isNullOrEmpty("");
        str.largestSubstring("We, are, living, in an, yellow, submarine, We don't, have anything");
    }
}
