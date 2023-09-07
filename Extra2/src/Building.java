public abstract class Building{
    /**
     *  atributos: ancho, alto y largo. La clase
     *          * edificio tendrá como métodos:
     *          * • Método calcularSuperficie(): calcula la superficie del edificio.
     *          * • Método calcularVolumen(): calcula el volumen del edifico.
     *          * Estos métodos serán abstractos y los implementarán las siguientes clases:
     */

    private double width;
    private double heigh;
    private double length;
    public abstract double calculateSurface();
    public abstract double calculatePerimeter();

}
