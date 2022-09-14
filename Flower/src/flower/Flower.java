
package flower;

public class Flower {
int petalCount = 0;
String s= "intial value";
Flower(int petals){
    System.out.println("Constructor w/ int arg only.petalCount ="+petalCount);
}
Flower(String ss){
    System.out.println("Constructor w/String arg only.s="+ss);
    s=ss;
}
Flower (String s, int petals){
    this (petals);
    //! thsi(s);//can't call two!
    this.s=s;//Another use of "this"
    System.out.print("String & int args");
}
Flower(){
    this("hi",47);
    System.out.println(" default constructor (no args)");
}
void printPetalCount(){
    //!this (11);//Not inside non-constructor!
    System.out.println("petslCount ="+petalCount+"s= "+s);
}

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
       
    }
    
}
