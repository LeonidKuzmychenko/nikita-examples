package project2;

public class Main {
    public static void main(String[] args) {
        String a = "a";
        System.out.println(a.getClass());

        Main m = new Main();
        System.out.println(m.getClass());
        m.print();
    }

    public void print(){
        System.out.println("Hello World");
    }
}
