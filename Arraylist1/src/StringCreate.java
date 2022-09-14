
public class StringCreate {
    public static void main(String[] args) {
        String s1="A Mi Jani";
        String s2=new String("A MI Jani");
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }else
                {
                    System.out.println("No Equals");
                }
        int p=s1.indexOf("M");
        System.out.println(p);
        
        int x=s1.length();
        System.out.println(x);
        String upN=s1.toUpperCase();
        System.out.println(upN);
        String loN=s2.toLowerCase();
        System.out.println(loN);
        
        boolean A=s1.endsWith("i");
        System.out.println(A);
        
    }
}
