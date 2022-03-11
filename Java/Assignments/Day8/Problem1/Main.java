package Java.Assignments.Day8.Problem1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals=new Animal[3];
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Tiger();

        System.out.println("Dog");
        animals[0].makeNoise();
        animals[0].eat();
        animals[0].walk();

        System.out.println("Cat");
        animals[1].makeNoise();
        animals[1].eat();
        animals[1].walk();

        System.out.println("Tiger");
        animals[2].makeNoise();
        animals[2].eat();
        animals[2].walk();
    }
}

