package practice;

public class tringle {
    public static void main(String[] args) {
    int a = 5;
    int b = 8;
    int g = (a*a)+(b*b); // Гипотенуза в квадрате
    double c = 9.43398113;// Гипотенуза
    Double p = a+b+c; // Периметр
    int s = (a*b)/2; // Периметр
    int x = 15;
    int y = 30;

    System.out.println("Площадь прямоугольного треугольника = " + s);
    System.out.println("Периметр прямоугольного треугольника = " + p);
    System.out.print("Периметр больше 15? ");
    System.out.println(p>x);
    System.out.print("Площадь меньше 30? ");
    System.out.println(s>y);
    }
}