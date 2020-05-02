import java.util.*;
class movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println(" Playing the movie " + title );
    }
}
public class movieobject{
    public static void main(String[]args){
    movie one = new movie();
    one.title = " Gone with the stock ";
    one.genre = " Tragic ";
    one.rating = -2;
    movie two = new movie();
    two.title = " Lost in Cubical Space ";
    two.genre = " Comedy ";
    two.rating = 5;
    two.playIt();
    movie three = new movie();
    three.title = " Byte Club ";
    three.genre = " Tragic but ultimately uplifting ";
    three.rating = 127;


    }
}