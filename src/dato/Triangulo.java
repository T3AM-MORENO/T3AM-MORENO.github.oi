package dato;

public class Triangulo {
    private double a;
    private double b;
    
    public Triangulo(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double hipotenusa() {
        return (a*a + b*b);
    }
}
