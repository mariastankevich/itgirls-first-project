package variables;

import java.util.Calendar;

public class unooperations {
    public static void main(String[] args) {
        int b = 50;//  инкремент ++
        int c = 20;// декремент - -
        int a = 22;
        System.out.println("Увеличьте b на 1 = " + ++b);
        System.out.println("Уменьшите c на 1 = " + --c);
        System.out.print("b больше либо равно 51 или с меньше 22: ");
        System.out.println(b>=b++ || c<a);
    }
}
