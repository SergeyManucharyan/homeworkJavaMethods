package generics;

/**
 * Create a generic type to represent a pair of objects. The two objects in the pair can
 * be of different types
 */
public class PairMain {
    public static void main(String[] args) {
        PairOfObject<String, Integer> pair = new PairOfObject<>("String", 5000);
        System.out.println(pair.getObjT());
        System.out.println(pair.getObjU());
        PairOfObject<Double, Character> pairOfObject = new PairOfObject<>(5.6, 'c');
        System.out.println(pairOfObject.getObjT());
        System.out.println(pairOfObject.getObjU());
    }
}
