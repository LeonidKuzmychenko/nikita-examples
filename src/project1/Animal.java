package project1;

public class Animal {

    private String name;
    private String breed;
    private String gender;
    private int age;

    public Animal(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //public - видно всем
    //private - видно самому себе (одному конкретному классу)
    //package-private - видно в рамках одного пакета
    //protected - видно в рамках иерархии наследования, расширяет package-private
    public void run() {
        System.out.println("Animal is running");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
