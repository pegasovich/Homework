package TestsMy.Triangle;


//       second(B)
//             / \
//            /   \
//           /     \
//          /       \
//         /_________\
//  first(A)    third(C)

 public class Triangle {




    private final Point first;
    private final Point second;
    private final Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double getArea() {

        double area = Math.abs((first.getX() * (second.getY() - third.getY()) + second.getX() * (third.getY() - first.getY()) + third.getX() * (first.getY() - second.getY())) / 2);
        if (area == 0) {
            System.out.println("Area = 0(zero), it means the three points are collinear. They lie in a straight line and do not form a triangle. ");
        }

       return area;
    }

}

class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}