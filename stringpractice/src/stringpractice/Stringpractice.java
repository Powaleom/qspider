 package stringpractice;

public class Stringpractice {

    
    public static void main(String[] args) {
        String str="Java Program";
        String str2=new String("java");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);
         char d[]={65,66,67,68};
        String str4=new String(d,2,2);
        System.out.println(str4 );
        
        
    }
    
}
