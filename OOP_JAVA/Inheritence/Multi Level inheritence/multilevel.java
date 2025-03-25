 // multi level inheritence means a child can inheritence property of his/her ancesstor in multiple level
class Animal{
 public void eat(){
    System.out.println("Animal Eats...");
 } 
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks...");
    }
}
class Puppy extends Dog{
    public void weep(){
        System.out.println("Puppy Weeps...");
    }
}

class multilevel{
    public static void main(String args[]){
        Puppy d = new Puppy();
        d.bark();
        d.eat();
        d.weep();
    }
}