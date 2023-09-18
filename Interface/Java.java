package Interface;

public class Java implements Language{

    @Override
    public void getVersion() {
        System.out.println("J1.1");
    }
    @Override
    public void type() {
        System.out.println("Programming");
    }
}
