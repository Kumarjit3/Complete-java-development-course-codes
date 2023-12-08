import SingleInheritance1.*;

public class DSingleInheritance1 
{
    public static void main(String[] args) 
    {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        System.err.println("\n");
        Animal a1 = new Animal();
        a1.eat();
        Animal a2 = new Dog();
        a2.eat();
    }
}
