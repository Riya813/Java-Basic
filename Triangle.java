class Triangle{
    double area;
    int height;
    int length;
    public static void main(String[] args){
        int x = 0;
        Triangle[] t = new Triangle[4];
        while(x<4){
            t[x] = new Triangle();
            t[x].height = (x + 1)*2;
            t[x].length = x + 4;
            t[x].setArea();
            System.out.print(" triangle  "+ x +" , area ");
            System.out.print(" = " + t[x].area);
            x= x + 1;
        }
    }
}