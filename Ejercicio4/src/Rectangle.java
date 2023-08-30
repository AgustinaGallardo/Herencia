public class Rectangle implements CalculationForm{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public Rectangle() {
    }

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        return base * altura;
    }

    @Override
    public double calculatePerimeter() {
        return (base + altura) * 2;
    }
}
