public class MotorBoat extends Ship{
    private Integer power;

    public MotorBoat(Integer power) {
        this.power = power;
    }

    public MotorBoat(Integer registration, double eslora, Integer manufacturing, Integer power) {
        super(registration, eslora, manufacturing);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

  public double calculateRent(double rent){
        return rent + power;
  }
}
