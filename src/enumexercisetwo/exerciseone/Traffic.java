package enumexercisetwo.exerciseone;

public enum Traffic {
    GREEN(5000),RED(3000),YELLOW(4000);
    private int second;

    Traffic(int second) {
        this.second = second;
    }
    Traffic(){

    }

    public int getSecond() {
        return second;
    }
}
