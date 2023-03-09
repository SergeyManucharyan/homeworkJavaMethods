package enumexercisetwo.exerciseone;

public class ChangeLight {
    private Traffic light;

    /**
     * this method print current light color and call nextLight method
     * @param light
     * @throws InterruptedException
     */
    void changing(Traffic light) throws InterruptedException {
        while (true) {
            System.out.println(light);
            Thread.sleep(light.getSecond());
            light=nextLight(light);

        }
    }

    /**
     * this method changes the color
     * @param light
     * @return next light color
     */
    Traffic nextLight(Traffic light){
        switch (light){
            case RED:return Traffic.GREEN;
            case GREEN:return Traffic.YELLOW;
        }
        return Traffic.RED;
    }
}
