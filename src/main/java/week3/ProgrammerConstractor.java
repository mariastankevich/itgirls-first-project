package week3;

public class ProgrammerConstractor {
    String name;
    int age;
    public ProgrammerConstractor(String name, int age) { // Constructor
        this.name = name; // = assign the name to that atribute
        this.age = age; // = assign the name to that atribute
    }
    public static void main(String[] args) { // Method that calls the constructor
        ProgrammerConstractor anna = new ProgrammerConstractor("Anna",25);
        ProgrammerConstractor maria = new ProgrammerConstractor("Maria",38);
        System.out.println("There is a programmer " + anna.name + ", she is " + anna.age + " years old.");
        System.out.println("There is a programmer " + maria.name + ", she is " + maria.age + " years old.");
    }
}
