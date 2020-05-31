package TestsMy.Triangle;

//       second(B)
//             / \
//            /   \
//           /     \
//          /       \
//         /_________\
//  first(A)    third(C)

public class UseTriangle {


    public static void main(String[] args) {

        Point a = new Point(15,15);
        Point b = new Point(23,30);
        Point c = new Point(50,25);

        Triangle t = new Triangle(a,b,c);

        System.out.println("area = "+t.getArea());






    }
}
