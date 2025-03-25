// The super keyword in java is reference variable which is used to refer immediate parent class object.

class Animal{
    String color = "White";
}

class Dog extends Animal{
    String color = "Black";

    void printColor(String color){
        System.out.println(color); // Red
        System.out.println(this.color); //Black
        System.out.println(super.color); // White
    }
}

class superUse{
    public static void main(String args[]){
        Dog d = new Dog();

        d.printColor("Red");
    }
}

