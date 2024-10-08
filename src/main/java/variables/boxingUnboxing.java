package variables;

public class boxingUnboxing {
    public static void main(String[] args) {
        long a = 1234567L; // примитивная переменная
        Long boxed; // класс обертка

        boxed = new Long(a); // 1й через конструктор
        boxed = Long.valueOf(a); //  2й способ через метод
        boxed = a;//  3й способ автоупаковка

        Long b = 1234567L; // ссылочная переменная
        long c = b.longValue(); // 1й способ unboxing
        c = b; // 2й способ

        byte v = 123; // примитивная переменная
        Byte boxedbyte; // класс обертка
        boxedbyte = new Byte(v); // 1й через конструктор
        boxedbyte = Byte.valueOf(v); //  2й способ через метод
        boxedbyte = v;//  3й способ автоупаковка

        Byte x = 123; // ссылочная переменная
        byte m = x.byteValue(); // 1й способ unboxing
        m = x; // 2й способ

        short o = 32767; // примитивная переменная
        Short boxedshort; // класс обертка
        boxedshort = new Short(o); // 1й через конструктор
        boxedshort = Short.valueOf(o); //  2й способ через метод
        boxedshort = o;//  3й способ автоупаковка

        Short p = 32767; // ссылочная переменная
        short n = x.shortValue(); // 1й способ unboxing
        n = p; // 2й способ

    }
}
