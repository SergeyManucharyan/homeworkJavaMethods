package inheritsnceandabstractclass.abstractclass.exerciseseven;

public class B extends Marks {
    int subjectsOne;
    int subjectsTwo;
    int subjectsThree;
    int subjectsFour;

    public B(int subjectsOne, int subjectsTwo, int subjectsThree, int subjectsFour) {
        if(subjectsOne>0&&subjectsOne<101&&subjectsTwo>0&&subjectsTwo<101&&subjectsThree>0&&subjectsThree<101
        &&subjectsFour>0&&subjectsFour<101) {
            this.subjectsOne = subjectsOne;
            this.subjectsTwo = subjectsTwo;
            this.subjectsThree = subjectsThree;
            this.subjectsFour = subjectsFour;
        }else {
            System.out.println("Incorrect input");
        }
    }

    @Override
    void getPercentage() {
        System.out.println((float) (subjectsOne+subjectsTwo+subjectsThree+subjectsFour)/4);
    }

}
