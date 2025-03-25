// inheritence is a mechanism in which one object acquires all the properties and behaviors of parent object. Inheritance is a mechanism in which one object acquires all the properties and behaviors of parent object. 
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class snake extends Animal{
    void eat(){
        super.eat();
        System.out.println("snake eats rats...");
    }
}
public class inheritence{
    public static void main(String[] args){
        snake s = new snake(); // cosnstructor of snake 
        s.eat();
    }
}