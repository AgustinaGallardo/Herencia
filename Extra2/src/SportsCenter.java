import java.util.Scanner;

public class SportsCenter extends Building {
    private String name;
    private Ceiling ceiling;
    Scanner sc = new Scanner(System.in);

    public SportsCenter() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public SportsCenter(double width, double heigh, double length, String name, Ceiling ceiling) {
        super(width, heigh, length);
        this.name = name;
        this.ceiling = ceiling;
    }
    @Override
    public SportsCenter createBuilding() {
        SportsCenter s = new SportsCenter();

        System.out.println("Ingrese el ancho del edificio:");
        s.setWidth(Double.parseDouble(sc.nextLine()));;

        System.out.println("Ingrese el alto del edificio:");
        s.setHeigh(Double.parseDouble(sc.nextLine()));

        System.out.println("Ingrese el largo del edificio:");
        s.setLength(Double.parseDouble(sc.nextLine()));

        System.out.println("Ingrese el nombre del polideportivo:");
        s.setName(sc.nextLine());

        System.out.println("Ingrese el tipo de techo (ROOFED / OPEN):");
        String ceilingType = sc.nextLine();
        Ceiling ceiling = Ceiling.valueOf(ceilingType.toUpperCase());

        s.setCeiling(ceiling);
        return s;
    }

    @Override
    public String toString() {
        return "SportsCenter{" +
                "name='" + name + '\'' +
                ", ceiling=" + ceiling +
                ", sc=" + sc +
                '}';
    }
}
