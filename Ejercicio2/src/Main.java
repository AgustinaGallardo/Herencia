import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * * Finalmente, en el main debemos realizar lo siguiente:
         *      * Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
         *      * el precio final de los dos electrodomésticos.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Creando una lavadora...");
        WashingMachine washingMachine = new WashingMachine(15);
        washingMachine = washingMachine.creatWashingMachine();

        System.out.println("Creando un televisor...");
        TV tv = new TV(50, true);
        tv = tv.crateTV();

        System.out.println("Precio final de la lavadora: $" + washingMachine.getPrice());
        System.out.println("Precio final del televisor: $" + tv.getPrice());

        scanner.close();
    }
}