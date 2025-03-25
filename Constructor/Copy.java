
class Copy{
    private int age;
    private String name;

     public Copy(int age , String name){
        this.name = name;
        this.age = age;
    }

    public Copy(Copy Obj2){
    this.age = Obj2.age;
    this.name= Obj2.name;
    System.out.println("Hello");
    }

    

    public static void main(String[] args){
            Copy name1 = new Copy(20, "Sachin");
            Copy name2= new Copy(name1);//copy

            
            System.out.println(name1);
            System.out.println(name2 + "I am copy");
    }
}
