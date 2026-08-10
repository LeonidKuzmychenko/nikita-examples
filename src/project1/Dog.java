package project1;

public class Dog extends Animal {

    public Dog(String name, String breed, String gender, int age) {
        super(name, breed, gender, age);
    }

    public void doAny(){
        run();
    }
}
