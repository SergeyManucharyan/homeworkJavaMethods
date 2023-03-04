package enumexercisetwo.exercisethree;

public class PlanetInfo {
    public static void main(String[] args) {
        for (Planets planet : Planets.values()) {
            System.out.println(planet + " distance " + planet.getDistance() + "KM mass " + planet.getMass() + " KG");
        }
    }
}
