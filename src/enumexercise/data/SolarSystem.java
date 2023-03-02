package enumexercise.data;

public enum SolarSystem {
    MERCURY(100200205456L){
        @Override
        public long distance() {
            return MERCURY.distance;
        }
    },
    VENUS(2259694214455L){
        @Override
        public long distance() {
            return VENUS.distance;
        }
    },
    EARTH(6565655999L){
        @Override
        public long distance() {
            return EARTH.distance;
        }
    },
    MARS(95995561532L){
        @Override
        public long distance() {
            return MARS.distance;
        }
    },
    JUPITER(7854333926L) {
        @Override
        public long distance() {
            return JUPITER.distance;
        }
    },
    SATURN(1029856510759L) {
        @Override
        public long distance() {
            return SATURN.distance;
        }
    },
    URANUS(30687388548L) {
        @Override
        public long distance() {
            return URANUS.distance;
        }
    },
    NEPTUNE(687796666560200L) {
        @Override
        public long distance() {
            return NEPTUNE.distance;
        }
    };
    private final long distance;

    SolarSystem(long distance) {
        this.distance = distance;
    }
    public abstract long distance();
}
