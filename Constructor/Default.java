// In java Constructor is said to be , when class name and Object name  both are same .
// when a object name is same as class but doesn't return value not even void value and parameters are not used in case it is known as ##Default_constructor

class Default{
// Default Constructor
   public Default() { 
        System.out.println("Default constructor"); 
    }
    public static void main(String[] args){
        Default hello = new Default(); // hello is instance variable , Default(); is constructor

        System.out.println("Hello i am :"+ hello);
    }
}
