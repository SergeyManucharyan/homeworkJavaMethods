import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(4);
        hashSet.add(9);
        hashSet.add(4);
        hashSet.add(46);
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(412);
        for (Integer item:hashSet) {
//            System.out.println(item);
            System.out.println(item.hashCode());
        }
    }
}
