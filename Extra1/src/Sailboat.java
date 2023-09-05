public class Sailboat extends Ship{
    private Integer masts; //mastiles

    public Sailboat() {
    }

    public Sailboat(Integer masts) {
        this.masts = masts;
    }

    public Sailboat(Integer registration, double eslora, Integer manufacturing, Integer masts) {
        super(registration, eslora, manufacturing);
        this.masts = masts;
    }

    public Integer getMasts() {
        return masts;
    }

    public void setMasts(Integer masts) {
        this.masts = masts;
    }
    public double calculateRent(double rent){
        return rent + masts;
    }

}
