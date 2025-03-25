import java.util.*;
class USERINPUT{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int val;

        do{
            System.out.println("Enter he positive Number");
            val = scan.nextInt();

        }while(val<=0);

        System.out.println("Positive number is:" + val);
    }
}