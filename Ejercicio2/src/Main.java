import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
         * para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
         * Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
         * deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
         * televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
         * precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
         * 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
         * electrodomésticos, 2000 para lavadora y 5000 para televisor.
         */
        Scanner scanner = new Scanner(System.in);

        List<Electrodomestico> lstElec = new ArrayList<>();


        /**
         *

        System.out.println("Creando una lavadora...");
        WashingMachine washingMachine = new WashingMachine(15);
        washingMachine = washingMachine.creatWashingMachine();

        System.out.println("Creando un televisor...");
        TV tv = new TV(50, true);
        tv = tv.crateTV();

         System.out.println("Precio final de la lavadora: $" + washingMachine.getPrice());
         System.out.println("Precio final del televisor: $" + tv.getPrice());
        */
        TV tv1 = new TV(23000,"WHITE",'A',233,40, true);
        TV tv2 = new TV(23000,"WHITE",'A',233,40, true);

        lstElec.add(tv1);
        lstElec.add(tv2);

        mostrarPrecios(lstElec);
        double precio = sumarPrecios(lstElec);
        System.out.println("Suma final: " + precio);
        scanner.close();
    }

    private static double sumarPrecios(List<Electrodomestico> lstElec) {
        double precios = 0;
        for (Electrodomestico e:lstElec
        ) {
            precios += e.getPrice();
        }
        return precios;
    }

    private static void mostrarPrecios(List<Electrodomestico> lstElec) {
        for (Electrodomestico e:lstElec
             ) {
            System.out.println(e.getPrice());
        }
    }




}