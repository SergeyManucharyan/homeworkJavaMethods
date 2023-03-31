package generics;

public class PairOfObject<T, U> {
    private T objT;
    private U objU;

    public PairOfObject(T objT, U objU) {
        this.objT = objT;
        this.objU = objU;
    }

    public T getObjT() {
        return objT;
    }

    public void setObjT(T objT) {
        this.objT = objT;
    }

    public U getObjU() {
        return objU;
    }

    public void setObjU(U objU) {
        this.objU = objU;
    }
}
