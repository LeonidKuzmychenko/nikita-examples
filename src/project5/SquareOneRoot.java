package project5;

public class SquareOneRoot extends SquareNoRoots{

    private double x1;

    public SquareOneRoot(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    @Override
    public String toString() {
        return "SquareOneRoot{x1=" + x1 + "}";
    }
}
