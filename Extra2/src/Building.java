import java.util.Scanner;

public abstract class Building{

    private double width;
    private double heigh;
    private double length;

    Scanner sc = new Scanner(System.in);

    public Building() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Building(double width, double heigh, double length) {
        this.width = width;
        this.heigh = heigh;
        this.length = length;
    }

    public  double calculateSurface(){
        return width * length;
    }
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
    public abstract Building createBuilding();


}
