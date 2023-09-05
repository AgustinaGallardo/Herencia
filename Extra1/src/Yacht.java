public class Yacht extends Ship{
    private Integer power;
    private Integer numberOfCabin;

    public Yacht(Integer power, Integer numberOfCabin) {
        this.power = power;
        this.numberOfCabin = numberOfCabin;
    }

    public Yacht(Integer registration, double eslora, Integer manufacturing, Integer power, Integer numberOfCabin) {
        super(registration, eslora, manufacturing);
        this.power = power;
        this.numberOfCabin = numberOfCabin;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getNumberOfCabin() {
        return numberOfCabin;
    }

    public void setNumberOfCabin(Integer numberOfCabin) {
        this.numberOfCabin = numberOfCabin;
    }

    public double calculateRent(double rent){
        return rent + power + numberOfCabin;
    }
}
