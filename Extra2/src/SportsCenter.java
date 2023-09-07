public class SportsCenter extends Building {
    /**
     * Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
     *  Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
     */
    private String name;
    private boolean roofing; //techado
    @Override
    public double calculateSurface() {
        return 0;
    }
    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
