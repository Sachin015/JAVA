// Runtime Polimorphism: Overriding the method of parent class in child class
class Animal{
    void sound(){
        System.out.println("Animal Sounds...");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks..");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat meow..");
    }
}

public class runtimeOverridePolimorphism{
    public static void main(String[] args){
        Animal animal1 = new Dog(); // making instance of dog in Animal(parent)
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();
    }
}