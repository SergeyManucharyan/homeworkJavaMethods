package arrays;

public class Methods {

    //1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը.

    /**
     *
     * @param  array of integers
     *          print positive elements of array
     *
     */
    public void arrayPositiveElements(int... n) {
        for (int j : n) {
            if (j > 0) {
                System.out.print(j + " ");
            }
        }
    }

    //2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ

    /**
     *
     * @param array of short
     * @return reversed array
     */
    public short[] revers(short... s) {
        short[] revered=new short[s.length];
        for (int i =0;i<revered.length;i++) {
            revered[i]=s[s.length-1-i];
        }
        return revered;
    }

    //3. Գրել method, որը գտնում եւ  տպում է  long[] l array-ի ամենամեծ տարրը

    /**
     *
     * @param array of long
     * @return maximum value of elements
     */
    public long maxValue(long... l) {
        long max = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        return max;
    }

    //4.Գրել method, որը գտնում եւ տպում է  float[] f  array-ի ամենափոքր տարրը

    /**
     *
     * @param array of float
     * @return minimum value of array
     */
    public float minValue(float... f) {

        float min = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }
        return min;
    }

    //5  .Գրել method, որը int[] n array-ի էլեմենտները եւ տեղափոխում  int[] m  array-ի մեջ։

    /**
     *
     * @param  array of integer
     * @return moves n array elements into m array.
     */
    public int[] arrayMove(int... n) {
        int[] m = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
        }
        return m;
    }

    //6. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array
    //        -ի համապատասխան էլեմենտները եւ գրում երրորդ array-ի մեջ։

    /**
     *
     * @param  first array of integer
     * @param  second array of integer
     * @return sums the elements of two arrays
     * and puts it in the third array
     */
    public int[] sumOfTwoArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    //7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։

    /**
     *
     * @param array of integer
     * @param integer number
     * @return how many times the number k was found in the elements of the array.
     */
    public int howManyTimes( int k,int... arr) {
        int count = 0;
        for (int el : arr) {
            if (el == k) {
                count++;
            }
        }
        return count;
    }
    //8.Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում տվերի դասավորությունը եական չէ

    /**
     *
     * @param array of integer
     *              print non-repeating triads
     */
    public void nonRepeatTriad(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    //9  Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:

    /**
     *
     * @param array of integer
     * @return descending array
     */
    public int[] exerciseNine(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                if (temp < arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //    10  Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ .
    //    վերջում լինեն կենտերը:

    /**
     *
     * @param array of numbers
     * @return array with odd elements at the end
     */
    public int[] oddAtTheEnd(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                if (temp % 2 == 1) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //11  Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները

    /**
     *
     * @param array of numbers
     * @return array without zeros
     */
    public int[] removeZero(int... arr) {
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        int index = 0;
        for (int j : arr) {
            if (j != 0) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }
    //12  Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:

    /**
     *
     * @param array of numbers
     *              print largest ascending sequence
     */
    public void largestSequence(int... arr){
        int startPoint = 0;
        int endPoint = 0;
        int length = 0;
        int[] index = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startPoint = endPoint;
                endPoint = i + 1;
                if (length < endPoint - startPoint) {
                    length = endPoint - startPoint;
                    index[0] = startPoint;
                    index[1] = endPoint;
                }
            }
        }
        if (arr.length - endPoint > endPoint - startPoint) {
            index[0] = endPoint;
            index[1] = arr.length;
        }
        for (int i = index[0]; i < index[1]; i++) {
            System.out.print(arr[i]);
        }
    }
    //13  Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված .
//        զանգված եւ արտածել n  թվի 10-ական ներկայացումը:

    /***
     *
     * @param string binary number
     *               print decimal number
     */
    public void toDecimal(String st){
        int result=0;
        int[] numArr=new int[st.length()];
        boolean bool =true;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Character.getNumericValue(st.charAt(i));
            if(numArr[i]!=1&&numArr[i]!=0){
                bool=false;
            }
        }
        for(int i=0;i< numArr.length;i++){
            result+=numArr[numArr.length-1-i]*(Math.pow(2,i));
        }
        if(bool) {
            System.out.print(result);
        }else{
            System.out.print("Wrong input");
        }
    }
     //14  Տպել տրված մատրիցի գլխավորա անկյունագծից վերեւ բոլոր տարերը:
    /**
     *
     * @param matrix
     * Print all elements above the main diagonal of the given matrix
     */
    public void aboveMainDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
     //15  Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:
    /**
     *
     * @param matrix
     * Rotates the square matrix of the given integers with respect to the main diagonal
     */
    public void rotateArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i]+" ");

            }
            System.out.println();
        }
    }

    /**
     *
     * @param matrix
     * For the given square matrix of natural numbers, outputs YES if its .
     * the sum of the elements of all rows is even. NO otherwise.
     */
    public void oddOrEven(int[][] matrix){
        String result="Yes";
        for (int[] ints : matrix) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum % 2 != 0) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}

