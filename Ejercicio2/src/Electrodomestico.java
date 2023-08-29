import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Electrodomestico {
    private float price;
    private String color;
    private char consum;
    private float weight;
    private List<Character> typeOfConsumption;
    private List<String> typeOfColor;
    private List<Electrodomestico> listElec;
    private Scanner sc;
    public Electrodomestico() {

        sc = new Scanner(System.in);
        typeOfConsumption = new ArrayList<>();
        typeOfConsumption.add('A');
        typeOfConsumption.add('B');
        typeOfConsumption.add('C');
        typeOfConsumption.add('D');
        typeOfConsumption.add('E');

        typeOfColor = new ArrayList<>();
        typeOfColor.add("WHITE");
        typeOfColor.add("RED");
        typeOfColor.add("BLACK");
        typeOfColor.add("GREY");
        typeOfColor.add("BLUE");

        listElec = new ArrayList<>();

    }

    public Electrodomestico(float price, String color, char consum, float weight) {
        this.price = price;
        this.color = color;
        this.consum = consum;
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsum() {
        return consum;
    }

    public void setConsum(char consum) {
        this.consum = consum;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * * • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
     *      * sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
     *      * objeto y no será visible.
     */

    private char checkEnergyConsumption(char letra){
        char byDefault = 'F';
        for (Character a:typeOfConsumption
             ) {
            if (a.equals(letra)) {
                return letra;
            }
        }
        return byDefault;
    }

    /**
     *  Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
     * usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
     * minúsculas. Este método se invocará al crear el objeto y no será visible.
     */

    private String checkColor(String color){
        String colorDefault = "white";
        for (String c:typeOfColor
             ) {
            if(color.equalsIgnoreCase(c)){
                return c;
            }
        }
        return colorDefault;
    }

    /**
     *  • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
     *      * electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
     *      * precio se le da un valor base de $1000.
     */

    public Electrodomestico createAppliance(){
        System.out.println("Ingrese el precio del electrodomestico");
        float price = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingrese el color del electrodomestico");
        String color = sc.nextLine();
        String c = checkColor(color);

        System.out.println("Ingrese el consumo electrico");
        String input = sc.nextLine();

        char result = ' ';
        if (input.length() == 1) {
            char con = input.charAt(0);
            result = checkEnergyConsumption(con);
        }

        System.out.println("Ingrese el peso");
        float w = sc.nextFloat();
        sc.nextLine();

        Electrodomestico e = new Electrodomestico(price,c,result,w);
        finalPriceConsum(e);
        finalPriceSice(e);
        listElec.add(e);
        return e;
    }

    /** *
     * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
     * precio. Esta es la lista de precios:
     */

    private Electrodomestico finalPriceConsum(Electrodomestico e){
        float price = 0;
        switch (e.getConsum()) {
            case 'A':
                price = 1000;
                break;
            case 'B':
                price = 800;
                break;
            case 'C':
                price = 600;
                break;
            case 'D':
                price = 500;
                break;
            case 'E':
                price = 300;
                break;
            case 'F':
                price = 100;
                break;
            default:
                System.out.println("Consumo no válido");
        }
        float finalPriceConsum = e.getPrice() + price;
        e.setPrice(finalPriceConsum);
        return e;
    }
    private Electrodomestico finalPriceSice(Electrodomestico e){
           float w = e.getWeight();
           float priceWeight = 0;
           if(w >= 1 && w <= 19 ){
               priceWeight = 100;
           }else if (w >= 20 && w <= 49){
               priceWeight = 500;
           }else if (w >= 50 && w <= 79 ){
               priceWeight = 800;
           }else if (w >= 80){
               priceWeight = 1000;
           }
           float finalPriceW = e.getPrice() + priceWeight;
           e.setWeight(finalPriceW);
           return e;
    }
}
