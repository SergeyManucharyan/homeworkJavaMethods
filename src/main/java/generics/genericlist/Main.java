package generics.genericlist;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>(5);
        list.add(1);
        list.add(1);
        list.add(12);
        list.add(6);
        list.add(1);
        list.add(98);
        System.out.println(list);
        System.out.println(list.indexOf(12));
        list.insert(2, 55);
        System.out.println(list.indexOf(12));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
