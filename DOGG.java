class DOGG{
    int size;
    String name;
    void bark( int numOfBarks){
        while ( numOfBarks > 0){
            if (size>60){
                System.out.println(" Woof! Woof! ");
            } else if (size>14){
                System.out.println(" Ruff! Ruff! ");
            } else{
                System.out.println(" Yip! Yip! ");
            }
            numOfBarks = numOfBarks - 1;
        }
        
    }
    public static void main(String[] args){
        DOGG one = new DOGG();
        one.size = 70;
        DOGG two = new DOGG();
        two.size = 8;
        DOGG three = new DOGG();
        three.size = 35;
        
        one.bark(3);
        two.bark(2);
        three.bark(3);
    }
}