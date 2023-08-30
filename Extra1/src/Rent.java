import java.util.Calendar;
import java.util.Scanner;

public class Rent {
    private String name;
    private Integer DNI;
    private Calendar rentDate;
    private Calendar returnDate;
    private Integer amarre;
    private Ship ship;
    private Scanner sc = new Scanner(System.in);

    public Rent() {
    }

    public Rent(String name, Integer DNI, Calendar rentDate, Calendar returnDate, Integer amarre, Ship ship) {
        this.name = name;
        this.DNI = DNI;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.amarre = amarre;
        this.ship = ship;
    }

    public void createRent() {
        Rent r = new Rent();
        System.out.println("ingrese su nombre");
        r.setName(sc.nextLine());
        System.out.println("Ingrese su numero de dni");
        r.setDNI(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese la fecha de alquiler");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Calendar getRentDate() {
        return rentDate;
    }

    public void setRentDate(Calendar rentDate) {
        this.rentDate = rentDate;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "name='" + name + '\'' +
                ", DNI=" + DNI +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", amarre=" + amarre +
                ", ship=" + ship +
                '}';
    }


    public Double numberDayRent(){
        if (rentDate == null || returnDate == null) {
            throw new IllegalStateException("Fechas de alquiler y devolución deben estar establecidas.");
        }

        long diffInMillis = returnDate.getTimeInMillis() - rentDate.getTimeInMillis();
        long days = diffInMillis / (24 * 60 * 60 * 1000); // Convertir milisegundos a días

        double costoPorDia = 10.0; // Precio por día de alquiler
        return costoPorDia * days;
    }



}
