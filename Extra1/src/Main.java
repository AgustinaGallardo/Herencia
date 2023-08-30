public class Main {
    public static void main(String[] args) {

        /**

         *
         * Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
         * alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
         * multiplicando por 10 los metros de eslora).
         * En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
         * sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
         * en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
         * el número de camarotes.
         * Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
         * métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
         * precio final de su alquiler.
         */


        Rent rent = new Rent();
        rent.createRent();
        rent.numberDayRent();

    }
}