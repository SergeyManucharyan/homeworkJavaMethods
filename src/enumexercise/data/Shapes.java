package enumexercise.data;

/**
 * Write an enum representing the different types of shapes,
 * with each shape having a method to calculate its area
 */
public enum Shapes {
    CIRCLE {
        public double area(double... a) {
            return Math.PI * Math.pow(a[0], 2);
        }
    },
    SQUARE {
        @Override
        public double area(double... d) {
            return Math.pow(d[0], 2);
        }
    },
    RECTANGLE {
        @Override
        public double area(double... d) {
            return d[0] * d[1];
        }
    },
    TRIANGLE {
        @Override
        public double area(double... d) {
            double s = (d[0] + d[1] + d[2]) / 2;
            return Math.sqrt(s * (s - d[0]) * (s - d[1]) * (s - d[2]));
        }
    };

    public abstract double area(double... d);
}
