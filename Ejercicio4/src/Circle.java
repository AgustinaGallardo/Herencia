public class Circle implements CalculationForm{
    private double radio;
    private double diametro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", diametro=" + diametro +
                '}';
    }

    public Circle(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double calculateArea() {
        double area = CalculationForm.PI * Math.pow(radio, 2);
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double per = CalculationForm.PI * diametro;
        return per;
    }
}
