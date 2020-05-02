import java.util.*;
public class conditionalQ{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    
        int A = scn.nextInt();
        if ( A > 90 )
        {
            System.out.println( " Excellent " );
        }
        else if ( A > 80 )
        { 
            System.out.println(" Good ");
        }
        else if ( A > 70 )
        { 
            System.out.println(" Fair ");
        }
        else if ( A > 60 )
        {
            System.out.println(" Meets Expectation ");
        }
        else 
        {
            System.out.println(" Below Par ");
        }
    }
}