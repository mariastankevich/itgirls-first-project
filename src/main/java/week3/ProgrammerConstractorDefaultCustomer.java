package week3;

public class ProgrammerConstractorDefaultCustomer {
    String name;
    int age;

    public ProgrammerConstractorDefaultCustomer() { // defult constractor
    }

    public ProgrammerConstractorDefaultCustomer(String name, int age) { // custom constractor
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        ProgrammerConstractorDefaultCustomer anna = new ProgrammerConstractorDefaultCustomer("Anna",25);

        ProgrammerConstractorDefaultCustomer maria = new ProgrammerConstractorDefaultCustomer();
        maria.name = "Maria";
        maria.age = 38;

        System.out.println("The programmer is " + anna.name + ", her age is " + anna.age);
        System.out.println("The programmer is " + maria.name + ", her age is " + maria.age);
    }
}
