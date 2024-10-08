package variables;

public class Char3Typs {
    public static void main(String[] args) {
    char h1 = 'ы'; //По значению символа
    char h2 = 1099; //По индексу символа в таблице UTF-8
    char h3 = '\u044B'; //Через шестнадцатеричную форму Unicode
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h3 = " + h3);
}
}
