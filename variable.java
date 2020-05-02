import java.util.*;
public class variable {
    public static void main (String[] args) {
        int x= 10;
        int y= 15;
        int sum= x+y;
        System.out.println("sum of " + x + "and" + y + "is" + sum );
        int prd= x * y;
        System.out.println(" product of " + x + " and " + y + " is " + prd );
        int V1=  x / y ;
        int V2= y / x ;
        int V3= x % y ;
        int V4= y % x ;
        System.out.println ( V1 );
        System.out.println ( V2 );
        System.out.println ( V3 );
        System.out.println ( V4 );
        int exp= x * y / x + y;
        System.out.println( exp );
        int exp1= ( x * y ) / ( x + y );
        System.out.println ( exp1);
    }

}