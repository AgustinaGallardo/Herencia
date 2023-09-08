public class OfficeBuilding extends Building{
    private Integer numberOfOffice;
    private Integer numberOfPeople;
    private Integer numberOfFloors;

    public OfficeBuilding() {
        super();
    }

    public Integer getNumberOfOffice() {
        return numberOfOffice;
    }

    public void setNumberOfOffice(Integer numberOfOffice) {
        this.numberOfOffice = numberOfOffice;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void amountOfPeople(){
        Integer number = 0;
    }

    public OfficeBuilding(double width,double heigth, double length, Integer numberOfOffice, Integer numberOfPeople, Integer numberOfFloors ) {
        super(width,heigth,length);
        this.numberOfOffice = numberOfOffice;
        this.numberOfPeople = numberOfPeople;
        this.numberOfFloors = numberOfFloors;
    }
    @Override
    public OfficeBuilding createBuilding() {
        OfficeBuilding b = new OfficeBuilding();

        System.out.println("Ingrese el ancho del edificio:");
        b.setWidth(Double.parseDouble(sc.nextLine()));

        System.out.println("Ingrese el alto del edificio:");
        b.setHeigh(Double.parseDouble(sc.nextLine()));

        System.out.println("Ingrese el largo del edificio:");
        b.setLength(Double.parseDouble(sc.nextLine()));

        System.out.println("Ingrese la cantidad de oficinas");
        b.setNumberOfOffice(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese la cantidad de personas");
        b.setNumberOfPeople(Integer.parseInt(sc.nextLine()));;

        System.out.println("Ingrese la cantidad de pisos");
        b.setNumberOfFloors(Integer.parseInt(sc.nextLine()));;

        return b;
    }
    public void cantPersonas(OfficeBuilding b) {
        int personasPorPiso = b.numberOfOffice * b.numberOfPeople;
        int personasEnEdificio = personasPorPiso * b.numberOfFloors;

        System.out.println("Personas por piso: " + personasPorPiso);
        System.out.println("Personas en todo el edificio: " + personasEnEdificio);
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfOffice=" + numberOfOffice +
                ", numberOfPeople=" + numberOfPeople +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

