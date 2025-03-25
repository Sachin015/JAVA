// hierarchical inheritence refers to where muliple child inheritence the property of single parent class 
class Computer{
    void cpu(){
        System.out.println("Computers cpu is brain ..");
    }
}
class Dell extends Computer{
    void dell(){
        System.out.println("Dell is a Popular WindowsOs based  PC");
    }
}
class Macbook extends Computer{
    void mac(){
        System.out.println("Mac is a Popular macOs based PC");
    }
}
class Android extends Computer{
    void android(){
        System.out.println("Android is a Popular AndroidOS based PC");
    }
}
class hierarchicallevel{
    public static void main(String args[]){
        Dell A = new Dell();
        Macbook B = new Macbook();
        Android C = new Android();

       A.cpu();
       A.dell();

       B.cpu();
       B.mac();

       C.cpu();
       C.android();
    }
}