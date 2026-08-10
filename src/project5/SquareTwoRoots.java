package project5;

public class SquareTwoRoots extends SquareOneRoot{

    private double x2;

    public SquareTwoRoots(double x1, double x2) {
        super(x1);
        this.x2 = x2;
    }

    public double getX2() {
        return x2;
    }

    @Override
    public String toString() {
        return "SquareTwoRoots{" +
                "x1=" + super.getX1() + " " +
                "x2=" + x2 +
                "}";
    }
}

