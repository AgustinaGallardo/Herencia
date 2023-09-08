import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
         * edificio tendrá como métodos:
         * • Método calcularSuperficie(): calcula la superficie del edificio.
         * • Método calcularVolumen(): calcula el volumen del edifico.
         * Estos métodos serán abstractos y los implementarán las siguientes clases:
         * • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
         * Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
         * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
         * por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
         * los atributos del padre.
         * De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
         * usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
         * (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
         * cuantas personas entrarían en un piso y cuantas en todo el edificio.
         *
         * Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
         * dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
         * métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
         * superficie y el volumen de cada edificio.
         * Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
         * techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
         * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
         */

        List<Building> lstBuilding = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int menuOption;
        String option;


        while (!exit) {
            System.out.println("1.Create a Office Building");
            System.out.println("2.Create a Sports Center");
            System.out.println("3.See all Buildings");
            System.out.println("4. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    OfficeBuilding o = new OfficeBuilding();
                    o = o.createBuilding();
                    o.calculatePerimeter();
                    o.calculateSurface();
                    o.cantPersonas(o);
                    lstBuilding.add(o);
                    break;
                case 2:
                    SportsCenter s = new SportsCenter();
                    s = s.createBuilding();
                    s.calculatePerimeter();
                    s.calculateSurface();
                    lstBuilding.add(s);
                    break;
                case 3:
                    int officeCount = 0;
                    int sportsCenterCount = 0;

                    for (Building b : lstBuilding) {
                        if (b instanceof OfficeBuilding) {
                            OfficeBuilding office = (OfficeBuilding) b; // CASTING para acceder a métodos específicos
                            office.cantPersonas(office);
                            officeCount++;
                        } else if (b instanceof SportsCenter) {
                            // Es un polideportivo
                            SportsCenter sportsCenter = (SportsCenter) b;
                            sportsCenter.calculatePerimeter();
                            sportsCenter.calculateSurface();
                            sportsCenterCount++;
                        }
                    }

                    System.out.println("Cantidad de edificios de oficinas: " + officeCount);
                    System.out.println("Cantidad de polideportivos: " + sportsCenterCount);
                    break;
                case 4:
                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;

                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");

            }
        }
    }
}



