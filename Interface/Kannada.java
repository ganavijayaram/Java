package Interface;

public class Kannada implements Language{

    @Override
    public void getVersion() {
        System.out.println("K1.1");
    }

    @Override
    public void type() {
        System.out.println("Speaking Language");
    }
}
