package arrays;

import java.util.Arrays;

public class ArrayUtil {

    public static void main(String[] args) {

        Methods methods = new Methods();

        //1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը.
        methods.arrayPositiveElements(5, 26, -8, 14, -9, 0);
        System.out.println("\n........................");
        //2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
       short[] m=methods.revers(new short[]{ 1,3,2, 4, 5, 6, 7, 8, 9});
        for (short value : m) {
            System.out.print(value+" ");
        }

        System.out.println("\n........................");
        //3. Գրել method, որը գտնում եւ  տպում է  long[] l array-ի ամենամեծ տարրը
        System.out.print(methods.maxValue(7569466225545L, 1234569895959597897L, 98765432155L, 9554524466L, 123654556256655L));
        System.out.println("\n........................");
        //4.Գրել method, որը գտնում եւ տպում է  float[] f  array-ի ամենափոքր տարրը
        System.out.print(methods.minValue(0.5f, 36.89f, 0.01f, 986.4f, 2.23f));
        System.out.println("\n........................");
        //5  .Գրել method, որը int[] n array-ի էլեմենտները եւ տեղափոխում  int[] m  array-ի մեջ։
        int[] mFive =methods.arrayMove(65, 98, 12, 74, 3, 65, 2, 8);
        for (int value:mFive ) {
            System.out.print(value+" ");
        }
        System.out.println("\n........................");
        //6. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array
        //        -ի համապատասխան էլեմենտները եւ գրում երրորդ array-ի մեջ։
        int[]arr=methods.sumOfTwoArray(new int[] {9, 4, 6, 7, 2, 1},new  int[] {5, 2, 1, 6, 3, 8});
        for (int el:arr) {
            System.out.print(el+" ");
        }
        System.out.println("\n........................");
        //7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։
        System.out.print(
        methods.howManyTimes(4,3,4,7,9,4,9,4,2,1)
        );
        System.out.println("\n........................");
        //8.Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում տվերի դասավորությունը եական չէ
        methods.nonRepeatTriad(1, 2, 3, 4);
        System.out.println("........................");

        //9  Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
        int[] desc = methods.exerciseNine(1,8,2,6,1,5,0);
        for (int el:desc) {
            System.out.print(el+" ");
        }
        System.out.println("\n........................");
        //10  Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:
        int[] arrOdd=methods.oddAtTheEnd(8,7,6,5,3,2,7);
        for (int el:arrOdd) {
            System.out.print(el+" ");
        }
        System.out.println("\n........................");
        //11  Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները
        int[] withoutZero=methods.removeZero(1,0,9,4,0,7,8,0);
        for (int el:withoutZero) {
            System.out.print(el+" ");
        }
        System.out.println("\n........................");

        //12  Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:
        methods.largestSequence(1, 2,3,4,9,10,25, 1, 2, 3, 5, 4, 1, 2, 3, 1, 2, 3, 4, 5, 1, 2);
        System.out.println("\n........................");
        //13  Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված .
        //        զանգված եւ արտածել n  թվի 10-ական ներկայացումը:
        methods.toDecimal("0110");
        System.out.println("\n........................");
        //14  Տպել տրված մատրիցի գլխավորա անկյունագծից վերեւ բոլոր տարերը:
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        methods.aboveMainDiagonal(matrix);
        System.out.println("........................");
        //15  Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:
        int[][] matrixForRotate={
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        methods.rotateArray(matrixForRotate);
        System.out.println("........................");
        int[][] matrixOddOrEven={
                {1,2,2},
                {4,6,4},
                {0,-4,8}
        };
        methods.oddOrEven(matrixOddOrEven);
    }
}
