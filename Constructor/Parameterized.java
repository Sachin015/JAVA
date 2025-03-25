
class Parameterized{
    private int age;
    private String name;

    Parameterized(int age , String name){
        this.name = name;
        this.age = age;
    }

    void GetOutput(){

          System.out.println("My name is :" + name + "" + " And my age is : " + age);
    }

    public static void main(String[] args){
        Parameterized name1 = new Parameterized(20, "Sachin");
        Parameterized name2= new Parameterized(25  , "Daniel");
        
            name1.GetOutput();
            name2.GetOutput();
    }
}
