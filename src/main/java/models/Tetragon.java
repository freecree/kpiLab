package models;

//@Deprecated
public class Tetragon extends Triangle {
    private double side4;
    private double diagonal1, diagonal2;
    private double square;
    public Tetragon(double s1, double s2, double s3, double s4 ) {
        super(s1, s2, s3);
        this.side4 = s4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    public double getSide4() {
        return side4;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    @Figure(name = "square3",
    desc = "Считает площадь треугольника")
    public void square() {
        //System.out.println("Square of Tetragon()");
        double p = (side1 + side2 + side3 + side4)/2;
        this.square = Math.sqrt((p-side1) * (p-side2) * (p-side3) * (p-side4));
    }

}
