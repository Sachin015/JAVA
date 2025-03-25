class A{
     void methodFirst(){
        System.out.println("I am Parent Class");
    }
    }
    class B extends A{
         void methodSecond(){
            System.out.println("I am Child Class");
        }
    }

class single{
        public static void main(String args[]){
        B obj = new B();
        obj.methodFirst();
        obj.methodSecond();
    }
}