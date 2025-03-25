class Exception{
    public static void main(String[] args){
        try{
            int top = 10, bot = 2 , result;
            result = top / bot;
            System.out.println("The result is :\t" + result);
        }catch(ArithmeticException e){
            System.out.println("Exception Caught" + e);
        }finally{
            System.out.println("code run successfully");
        }
        
    }
}