public class Main {
    public static void main(String[] args) throws Exception {
        Point p1 = new Point(5,10);
        Point p2 = new Point(11,15);
        Point p3 = new Point(16,20);
        Point p4 = new Point(21,25);

        Vector_2D v1 = new Vector_2D(p1,p2);
        Vector_2D v2 = new Vector_2D(p3,p4);

        System.out.println("DOT PRODUCT: "+ v1.dot_product(v2));
    }
}
