package Java.Assignments.Day7.Problem1;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly();
        Parrot obj=(Parrot) b1;
        obj.sing();
    }
}
abstract class Bird{
    public abstract void fly();
}
class Parrot extends Bird {

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }

    public void sing() {
        System.out.println("I am Singing");
    }
}