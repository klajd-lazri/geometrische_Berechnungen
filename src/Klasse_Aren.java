public class Klasse_Aren {

    // Flächeninhalt eines Dreiecks
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Umfang eines Dreiecks
    public static double trianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Flächeninhalt eines Trapezes
    public static double trapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }
}
