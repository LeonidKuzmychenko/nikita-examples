package project17;

public class Student {

    private String name;
    private int grate;

    public Student(String name, int grate) {
        this.grate = grate;
        this.name = name;
    }

    public int getGrate() {
        return grate;
    }

    public void setGrate(int grate) {
        this.grate = grate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grate=" + grate +
                ", name='" + name + '\'' +
                '}';
    }
}
