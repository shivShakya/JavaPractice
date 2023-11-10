package core.main;



import core.main.animals.*;
import core.main.dogs.*;
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        
        animal1.makeSound();
        dog1.makeSound();
       
    }
}
