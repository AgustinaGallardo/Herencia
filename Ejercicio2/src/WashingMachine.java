import java.util.Scanner;

public class WashingMachine extends Electrodomestico{
    private float burden;
    private Scanner sc;

    public WashingMachine(float burden) {
        super();
        this.burden = burden;
        sc = new Scanner(System.in);
    }

    public WashingMachine(float price, String color, char consum, float weight, float burden) {
        super(price, color, consum, weight);
        this.burden = burden;
    }

    public float getBurden() {
        return burden;
    }

    public void setBurden(float burden) {
        this.burden = burden;
    }

    /**
     * • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
     *      *  padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
     *      *  el atributo propio de la lavadora.
     * @return
     */

    public WashingMachine creatWashingMachine(){
        Electrodomestico e = createAppliance();
        System.out.println("Ingrese la carga de la lavadora");
        float carga = sc.nextFloat();
        sc.nextLine();

        WashingMachine w = new WashingMachine(e.getPrice(), e.getColor(), e.getConsum(), e.getWeight(), carga);
        return finalPrice(w);
    }

    /**
     * * • Método precioFinal(): este método será heredado y se le sumará la siguiente
     *      * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
     *      * carga es menor o igual, no se incrementará el precio. Este método debe llamar al
     *      * método padre y añadir el código necesario. Recuerda que las condiciones que hemos
     *      * visto en la clase Electrodoméstico también deben afectar al precio.
     */

    private WashingMachine finalPrice(WashingMachine w){
        float price = w.getPrice();
        float carga = w.getBurden();
        if(carga > 30){
            price += 500;
        }
        w.setPrice(price);
        return w;
    }
}
