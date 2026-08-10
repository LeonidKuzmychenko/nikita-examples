package project5;

public class Main {

    public static void main(String[] args) {
        System.out.println(square(1, 2, 3));
        System.out.println(square(1, -3, -4));
    }

    public static SquareRoots square(int a, int b, int c) {
        double discriminant = (double) b * b - 4.0 * a * c;

        if (discriminant < 0) {
            // Действительных корней нет
            return new SquareNoRoots();
        }

        if (discriminant == 0) {
            double x = -(double) b / (2.0 * a);
            return new SquareOneRoot(x);
        }

        double sqrtDiscriminant = Math.sqrt(discriminant);

        double x1 = (-b + sqrtDiscriminant) / (2.0 * a);
        double x2 = (-b - sqrtDiscriminant) / (2.0 * a);

        return new SquareTwoRoots(x1, x2);
    }
}
