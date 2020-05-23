package OOP.Triangle;

/*      second
 *       / \
 *      /   \
 *     /     \
 *   /        \
 *   ----------\
 * first        third
 *
 * **/
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
        double height = second.getY() - first.getY();
        double width = third.getX() - first.getX();

        return (height * width) / 2;
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