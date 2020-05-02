import java.util.*;
public class primenumbertilln{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for( int i = 0; i <= n; i++ ){
            int count = 0;
            for (int div = 1; div <= n; div++){
                if( n % div == 0){
                    count++;
                }
            }
            if( count == 2) {
               System.out.println(" prime ");
            }
            else{
                System.out.println(" not prime");
            }
        }
        
    }
} 