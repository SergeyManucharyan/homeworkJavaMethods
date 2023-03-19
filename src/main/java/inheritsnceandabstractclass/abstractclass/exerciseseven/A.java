package inheritsnceandabstractclass.abstractclass.exerciseseven;

public class A extends Marks {
    int subjectsOne;
    int subjectsTwo;
    int subjectsThree;

    public A(int subjectsOne, int subjectsTwo, int subjectsThree) {
        if(subjectsOne>0&&subjectsOne<101&&subjectsTwo>0&&subjectsTwo<101&&subjectsThree>0&&subjectsThree<101) {
            this.subjectsOne = subjectsOne;
            this.subjectsTwo = subjectsTwo;
            this.subjectsThree = subjectsThree;
        }else {
            System.out.println("Incorrect input");
        }
    }

    @Override
    void getPercentage() {
        System.out.println((float) (subjectsOne+subjectsTwo+subjectsThree)/3);
    }
}
