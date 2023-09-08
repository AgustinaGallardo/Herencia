public abstract class Alojamiento {
    /**
     * Los alojamientos se identifican por un nombre, una dirección,
     * una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
     * alojamientos: Hoteles y Alojamientos Extrahoteleros.
     * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
     * Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
     * características de las distintas categorías son las siguientes:
     *
     * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
     * Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
     * Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
     * Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
     * acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
     * cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
     * será.
     * El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
     * PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
     * agregado por gimnasio) + (valor agregado por limosinas).
     */

    private String name;
    private String direction;
    private String Location;
    private String manager;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
