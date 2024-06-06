// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double base = 3.0;
        double side = 4.0;
        double  height = 5.0;
        System.out.println("Dreieckfläche: " + Klasse_Aren.triangleArea(base, height));
        System.out.println("Dreieckumfang: " + Klasse_Aren.trianglePerimeter(base, side, height));

        double base2 = 4.0;
        System.out.println("Trapezfläche: " + Klasse_Aren.trapezoidArea(base, base2, height));
    }
}