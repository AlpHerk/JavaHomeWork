
public class MyExam8_3 {


    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 2);
        double dist;
        dist = p1.distance(p2);
        System.out.println("二维平面点p1与p2的距离：" + dist);

        Point3D d1 = new Point3D();
        Point3D d2 = new Point3D(2, 2, 2);
        double dist3D;
        dist3D = d1.distance(d2);
        System.out.println("三维平面点d1与d2的距离：" + dist3D);
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

    public double distance(Point p) {
        // 原题中该函数非静态方法，故作此写法
        double d;
        d = Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2));
        return d;
    }
}

class Point3D extends Point {
    int z;

    public Point3D() {
        super(0, 0);
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    } 
    public double distance(Point3D p) {
        double d;
        d = Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2) + Math.pow(this.z-p.z, 2));
        return d;
    }
}

