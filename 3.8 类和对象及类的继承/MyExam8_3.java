
public class MyExam8_3 {


    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 2);
        double dist;
        dist = Point.distance(p1, p2);
        System.out.println(dist);
    }

}

class Point {

    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double d;
        d = Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2));
        return d;
    }
}

class Point3D extends Point {
    int z;
    public Point3D() {
        Point(0, 0, 0);
    } 
    public Point3D(int x, int y, int z) {

    }
}

