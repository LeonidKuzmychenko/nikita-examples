package project9;

public abstract class Student {

    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.grade = grade;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}


