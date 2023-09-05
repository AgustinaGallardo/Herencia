import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Rent{
    private String name;
    private Integer DNI;
    private Calendar rentDate;
    private Calendar returnDate;
    private Integer amarre;
    private Ship ship;
    private Scanner sc = new Scanner(System.in);
    private List<Ship> lstShips;
    public Rent() {
        lstShips = new ArrayList<>();
    }
    public Rent(String name, Integer DNI, Calendar rentDate, Calendar returnDate, Integer amarre, Ship ship) {
        this.name = name;
        this.DNI = DNI;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.amarre = amarre;
        this.ship = ship;
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

    /**
     * Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
     * alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
     * multiplicando por 10 los metros de eslora).
     */
    private Double paymentForRent(Ship ship){
        if (rentDate == null || returnDate == null) {
            throw new IllegalStateException("Fechas de alquiler y devolución deben estar establecidas.");
        }
        long diffInMillis = returnDate.getTimeInMillis() - rentDate.getTimeInMillis();
        long days = diffInMillis / (24 * 60 * 60 * 1000); // Convertir milisegundos a días
        double eslora = ship.getEslora()*10;
        return ship.calculateRent(days * eslora);
    }
     public void createRent() {
     System.out.println("ingrese su nombre");
     this.setName(sc.nextLine());
     System.out.println("Ingrese su numero de dni");
     this.setDNI(Integer.parseInt(sc.nextLine()));

         // Ingresar la fecha de alquiler como una cadena
         System.out.println("Ingrese la fecha de alquiler (en formato dd/MM/yyyy):");
         String dateString = sc.nextLine();

         // Convertir la cadena de fecha a un objeto Calendar
         Calendar rentDate = parseDateStringToCalendar(dateString);
            this.setRentDate(rentDate);

         System.out.println("Ingrese la fecha que termina el alquiler (en formato dd/MM/yyyy):");
         String returnDateString = sc.nextLine();

         // Convertir la cadena de fecha a un objeto Calendar
         Calendar returnDate = parseDateStringToCalendar(returnDateString);
         this.setReturnDate(returnDate);

         System.out.println("Que tipo de barco quiere alquilar");
        String rent = sc.nextLine();
        rent = rent.toUpperCase();
        rentShip(rent);
    }

    // Método para convertir una cadena de fecha en un objeto Calendar
    private Calendar parseDateStringToCalendar(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(dateString);
            calendar.setTime(date);
        } catch (ParseException e) {
            System.out.println("Error al analizar la fecha. Asegúrate de ingresarla en el formato correcto (dd/MM/yyyy).");
        }
        return calendar;
    }

    private void rentShip(String rent) {
        System.out.println("Ingrese la matricula");
        Integer registration = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la eslora del barco");
        double eslora = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la manufactura");
        Integer facturing = Integer.parseInt(sc.nextLine());

        switch (rent) {
            case "MOTORBOAT":
                System.out.println("Ingrese el poder del motor");
                Integer power = Integer.parseInt(sc.nextLine());
                MotorBoat motorBoat = new MotorBoat(registration,eslora,facturing,power);
                double pay = paymentForRent(motorBoat);
                System.out.println("Tiene que pagar " + pay);
                lstShips.add(motorBoat);
                break;
            case "SAILBOAT":
                System.out.println("Ingrese los mastiles del velero");
                Integer masts = Integer.parseInt(sc.nextLine());
                Sailboat sailboat = new Sailboat(registration,eslora,facturing,masts);
                double pay1 = paymentForRent(sailboat);
                System.out.println("Tiene que pagar " + pay1);
                lstShips.add(sailboat);
                break;
            case "YACHT":
                System.out.println("Ingrese el poder del yate");
                Integer pow = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese el numero de cabina");
                Integer cabin = Integer.parseInt(sc.nextLine());
                Yacht yacht = new Yacht(registration,eslora,facturing,pow,cabin);
                double pay2 = paymentForRent(yacht);
                System.out.println("Tiene que pagar " + pay2);
                lstShips.add(yacht);
                break;
            default:
                System.out.println("Error. You must choose a valid option.");
                System.out.println("");
        }
    }


}
