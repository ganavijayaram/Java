package Abstract;

abstract class Animals {
    Animals() {
        System.out.println("Animal constructor");
    }

    abstract void sound();

    public void eat() {
        System.out.println("Animal is eating");
    }
}

