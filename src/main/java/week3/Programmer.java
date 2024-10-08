package week3;

public class Programmer {
    String name; // не статическая переменная в классе 2 переменнные для всех экземаляров класса
    int age;//не статическая переменная в классе
    static int count = 0; // статичская переменная для подсчета программистов

    public void writeCode () { // сам метод ничего не возвращает
        System.out.println("is writing Code"); // но внутри метода есть инструкция "печатать на экран"
    }
    public String drinkCoffee () { // сам метод возвращает возвращает значение и  println не надо
        return " is drinking Coffee"; // даю команду, что вернуть в переменную, которая указана в методе
    }
    public String drink (String drinkType) { // сам метод возвращает возвращает значение и  println не надо
        return " is drinking" + drinkType; // даю команду, что вернуть в переменную, которая указана в методе
    }
    public static void main (String[] args) { // метод НЕ возвращает никакого значения = VOID
        Programmer anna = new Programmer(); // экземпляр
        anna.name = "Anna"; // переменные экземпляра
        anna.age = 25; // переменные экземпляра
        count++; // увкличение переменной count на 1
        System.out.println("There is a programmer "+ anna.name + " and she is "+ anna.age+ " years old.");
        System.out.println("Now "+ anna.name);
        anna.writeCode(); // будет напечатано "is writing Code", так как в методе writeCode void+println
        System.out.println("and also"+ anna.drink(" Tea") + ".");

        Programmer maria = new Programmer();
        maria.name = "Maria";
        maria.age = 39;
        count++; // увкличение переменной count на 1
        System.out.println("There is a programmer "+ maria.name + " and she is "+ maria.age+ " years old.");
        System.out.println("Now "+ maria.name);
        maria.drinkCoffee(); // не будет напечатано is drinking Coffee, так как в методе drinkCoffee RETURN

        System.out.println("There are "+ Programmer.count + " programmers in the company. "); // или просто count

    }
}
