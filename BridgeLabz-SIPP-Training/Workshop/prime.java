import java.util.*;

public class prime{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("invalid number");
        }
        if(n==2|| n==3){
            System.out.println("prime");
        }
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("not prime");
            
            }
            
        } 
        
            System.out.println("prime");
        
    }
}