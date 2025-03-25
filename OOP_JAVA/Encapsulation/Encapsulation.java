class GETSET{
    private String name ; // 

     public String getname(){
        return  name;
    }
    public void setName(String NewName ){
        this.name = NewName ; 
    }
}
class Encapsulation{
    public static void main(String[] args){
        GETSET Myname = new GETSET();
        Myname.setName( "Sachin");
        System.out.println(Myname.getname());
    }
}