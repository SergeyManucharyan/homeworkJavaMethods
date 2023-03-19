package inheritsnceandabstractclass.inheritsnce.three;

public class ThirdGeneration extends SecondGeneration{
    @Override
    public void info() {
        super.info();
        System.out.println("ThirdGeneration");
    }
}
