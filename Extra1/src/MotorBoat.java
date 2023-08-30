public class MotorBoat extends Ship{

    private Integer power;

    public MotorBoat(Integer power) {
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public Integer modulo() {
        return power;
    }
}
