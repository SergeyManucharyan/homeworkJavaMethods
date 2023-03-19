package inheritsnceandabstractclass.inheritsnce.three;

public class SecondGeneration extends FirstGeneration{
    @Override
    public void info() {
        super.info();
        System.out.println("SecondGeneration");
    }
}
