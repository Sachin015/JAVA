// Function overloading is also known as compile time polymorphism. In function overloading, more than one function can have the same name but different parameters.
class Calculator{
    
    public int add(int num1 , int num2){
        return num1 + num2;
    }
    public int add(int num1 , int num2, int num3){
        return num1 + num2 + num3;
    }
    public double add(double num1 , double num2){
        return num1 + num2;
    }
}

public class compiletimeOverloading{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("sum of 5 and 10:" + calculator.add(5,10));
        System.out.println("sum of 5 , 10 and 15:" + calculator.add(5,10,15));
        System.out.println("sum of 2.5 and 3.5:" + calculator.add(2.5,3.5));
    }
}