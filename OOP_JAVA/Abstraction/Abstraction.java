abstract class Main{
    void ide(){ // method 1
        System.out.println("vs cods is opensource and best");
    }
    void Java(){ // method 2
        System.out.println("Java on VS code ");
    }
    void Javascript(){ // method 3
        System.out.println("Javascript on VS code ");
    }
    abstract void webDev();
}

    class Dev extends Main{
        void webDev() {
           System.out.println("Doing Prohect for E-commerce site");
            
        }
    }
class Abstraction{
    public static void main(String[] args){
        Dev code = new Dev();
        code.Java();
        code.Javascript();
        code.webDev();
    }
}