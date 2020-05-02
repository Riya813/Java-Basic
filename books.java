class books{
    String title;
    String author;


    public static void main(String[] args){
        books[] mybooks = new books[3];
        int x = 0;
        mybooks[0] = new books();
        mybooks[1] = new books();
        mybooks[2] = new books();

        mybooks[0].title = " The Grapes of Java ";
        mybooks[1].title = " The java Gatsby ";
        mybooks[2].title = " The java Cookbook ";
        mybooks[0].author = " bob ";
        mybooks[1].author = " sue ";
        mybooks[2].author = " ian ";

        while(x<3){
            System.out.print(mybooks[x].title);
            System.out.print(" by ");
            System.out.print(mybooks[x].author);
            System.out.println(" ");
            x = x + 1;
        }
    }

}
