class nothing{
void go(){
    nothing t = new nothing();
    t.taketwo(12,34);
}
void taketwo(int x, int y){
    int z = x + y;
    System.out.println(" total is" + z);
}
}
       