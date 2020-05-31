package TestsMy.OOP;

abstract class shape
{
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}
class Area extends shape
{
    double RectangleArea(double length, double breadth)
    {
        return length*breadth;
    }
    double SquareArea(double side)
    {
        return side*side;
    }
    double CircleArea(double radius)
    {
        return 3.14*radius*radius;
    }
}
class Main
{
    public static void main(String args[])
    {
        Area obj=new Area();
        double rect=obj.RectangleArea(10,20);
        double squr=obj.SquareArea(rect);
        double circ=obj.CircleArea(squr);
        System.out.println("Rectangle Area: "+rect);
        System.out.println("Square Area: "+squr);
        System.out.println("Circle Area: "+circ);
    }
}