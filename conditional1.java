import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class conditional1{
    public static void main(String[] args){
        int n1= 385422;
        int n2= 3824287;
        if ( n1 == n2)
        {
            System.out.println( n1 + " is equal to " + n2 );
        }
        else 
        {
            if ( n1 > n2 )
            {
                System.out.println( n1 + "is greater than " + n2 );
            }
            else
            {
                System.out.println( n1 + " is smaller than " + n2 );
            }
        }

    }
}
