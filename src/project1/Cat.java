package project1;

public class Cat extends Animal {

    public Cat(String name, String breed, String gender, int age) {
        super(name, breed, gender, age);
    }

    public void scratches() {
        if (getGender().equals("female")) {
            System.out.println("Простите я киса, я не могу царапаться, у меня лапки>");
            return;
        }

        if (getGender().equals("male")) {
            System.out.println("Я кот и Больно царапаюсь");
        }
    }

    public void run() {
        System.out.println("Cat is running very good");
    }


}