public abstract class Ship {
    private Integer registration; //matricula
    private double eslora ; //metros
    private Integer manufacturing;
    public Ship() {
    }
    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Integer getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(Integer manufacturing) {
        this.manufacturing = manufacturing;
    }

    public Ship(Integer registration, double eslora, Integer manufacturing) {
        this.registration = registration;
        this.eslora = eslora;
        this.manufacturing = manufacturing;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "registration=" + registration +
                ", eslora=" + eslora +
                ", manufacturing=" + manufacturing +
                '}';
    }
    public abstract double calculateRent(double rent);
}
