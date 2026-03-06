public class Rectangle extends Shape {
    double W;
    double L;

    public Rectangle (double W, double L) {
        this.W=W;
        this.L=L;
    }
    double getArea() {
        return L*W;
    }
}
