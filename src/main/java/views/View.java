package views;

public class View {

    public void showTriangle(double s1, double s2, double s3) {
        System.out.println("Стороны треугольника: "+s1+" "+s2+" "+s3);
    }
    public void showTetragon(double s1, double s2, double s3, double s4) {
        System.out.println("Стороны треугольника: "+s1+" "+s2+" "+s3+" "+s4);
    }
    public void showSquare(String message, double square) {
        System.out.println(message+square);
    }
}
