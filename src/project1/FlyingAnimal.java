package project1;

public class FlyingAnimal extends Animal {

    private boolean flying;

    public FlyingAnimal(String name, String breed, String gender, int age, boolean flying) {
        super(name, breed, gender, age);
        this.flying = flying;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", flying=" + isFlying() +
                ", age=" + getAge() +
                '}';
    }
}
