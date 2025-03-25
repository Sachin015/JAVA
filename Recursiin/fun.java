import java.util.*;

class recursion{
   
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        fun n = new fun();
        System.out.println("Enter the num you want Recursive\n");
        int number = scan.nextInt();
        System.out.println(n.fact(number));
        scan.close();
    }
    
}
public class  fun{

    int fact(int n){
    if(n==0 || n==1){
        return 1;
    }else{
       return  n*fact(n-1);
    }
}

}