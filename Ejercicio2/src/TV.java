import java.util.Scanner;

public class TV extends Electrodomestico{
    private float pulgada;
    private boolean TDT;
    private Scanner sc = new Scanner(System.in);

    public TV(float pulgada, boolean TDT) {
        this.pulgada = pulgada;
        this.TDT = TDT;
    }

    public TV(float price, String color, char consum, float weight, float pulgada, boolean TDT) {
        super(price, color, consum, weight);
        this.pulgada = pulgada;
        this.TDT = TDT;
    }

    public float getPulgada() {
        return pulgada;
    }

    public void setPulgada(float pulgada) {
        this.pulgada = pulgada;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }


    /**
     * Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
     * padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
     * los atributos del televisor.
     *
     */


    public TV crateTV() {
        Electrodomestico e = createAppliance();
        System.out.println("Ingrese las pulgadas del TV");
        float pulgada = sc.nextFloat();
        sc.nextLine();
        String tdt = "";
        boolean td = false;
        do {
            System.out.println("Tiene TDT Y/N:");
            tdt = sc.nextLine();
            if (tdt.equalsIgnoreCase("Y")) {
                td = true;
            } else if (tdt.equalsIgnoreCase("N")) {
                td = false;
            }
        } while (!tdt.equals("Y") && !tdt.equals("N"));

        TV tv = new TV(e.getPrice(), e.getColor(), getConsum(), e.getWeight(), pulgada, td);
        setPriceTV(tv);
        return tv;
    }

    /**
     • Método precioFinal(): este método será heredado y se le sumará la siguiente
     * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
     * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
     * $500.

     */

    private TV setPriceTV(TV tv){
        float pul = tv.getPulgada();
        float newPrice = tv.getPrice();
        boolean haveTDT = tv.isTDT();
        if(pul > 40){
            newPrice *= 1.3;
        }

        if(haveTDT){
            newPrice += 500;
        }
        tv.setPrice(newPrice);
        return tv;
    }
}
