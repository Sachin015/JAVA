// single child multiple Parents . this doesn't supports by Java by Default
class firstParent{
    void house(){
        System.out.println("4th Floor house");
    }
}
class secondParent{
    void house(){
        System.out.println("7th Floor house");
    }
}


class child extends firstParent , secondParent{
 System.out.println("I am child..");
}
class multipleinheritence{
    public static void main(String args[]){
        child props = new child();
        props.house(); // // compiler couldn't identify method in this case : error
    }
}