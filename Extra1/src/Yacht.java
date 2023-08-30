public class Yacht extends Ship{
    private Integer power;
    private Integer numberOfCabin;

    public Yacht(Integer power, Integer numberOfCabin) {
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

    @Override
    public Integer modulo() {

        return power + numberOfCabin;
    }
}
