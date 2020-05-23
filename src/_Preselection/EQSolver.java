package _Preselection;

public class EQSolver {

    public static void main(String[] args) {

        double a = 2;
        double b = -8;
        double c = -24;
        double x1;
        double x2;

        x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println(x1);
        System.out.println(x2);

    }

}