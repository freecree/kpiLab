package models;

//@Deprecated
public class Tetragon extends Triangle {
    private double side4;
    private double diagonal1, diagonal2;
    private double square;

    public Tetragon(double s1, double s2, double s3, double s4) {
        super(s1, s2, s3);
        this.side4 = s4;
    }
    public Tetragon() {}

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
    @FigureAnnotation(name = "square3",
            desc = "Считает площадь треугольника")
    public void square() {
        //System.out.println("Square of Tetragon()");
        double p = (side1 + side2 + side3 + side4) / 2;
        this.square = Math.sqrt((p - side1) * (p - side2) * (p - side3) * (p - side4));
    }

    public static class Builder {
        //Обязательные параметры
        double side1;
        double side2;
        double side3;
        double side4;

        //Конструктор с обязательными параметрами
//        public Builder(int a, int b) {
//            this.a = a;
//            this.b = b;
//        }

        //Методы с возвращающим типом Builder для необязательного параметра с, d, e, f,
        public Builder setSide1(double val) {
            side1 = val;
            return this;
        }

        public Builder setSide2(double val) {
            side2 = val;
            return this;
        }

        public Builder setSide3(double val) {
            side3 = val;
            return this;
        }

        public Builder setSide4(double val) {
            side4 = val;
            return this;
        }

        //Метод с возвращающим типом Good для генерации объекта
        public Tetragon build() {
            return new Tetragon(this);
        }
    }
    private Tetragon(Builder builder) {
        super();
        this.side1 = builder.side1;
        this.side2 = builder.side2;
        this.side3 = builder.side3;
        this.side4 = builder.side4;

    }
}
