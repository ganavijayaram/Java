package Abstract;

public class Cat extends Animals{

    Cat() {
        super();
        System.out.println("Cat constructor");
        //super(); -  error
    }
    @Override
    void sound() {
        System.out.println("Cat");
    }
}
