public class Main {
    public static void main(String[] args) {
        /**

         * Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
         * calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
         * resultado final.
         *
         */


        Circle c = new Circle(2,5);
        Rectangle r = new Rectangle(4,3);

        double cArea = c.calculateArea();
        double cPer = c.calculatePerimeter();

        double rArea = r.calculateArea();
        double rPer = r.calculatePerimeter();


        System.out.println("El area del circulo es: " + cArea);
        System.out.println("El perimetro del circulo es: " + cPer);

        System.out.println("El area del rectangulo es: " + rArea);
        System.out.println("El perimetro del rectangulo es: " + rPer);

    }
}