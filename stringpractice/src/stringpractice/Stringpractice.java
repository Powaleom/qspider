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
        
        String str5=new String("   netbean   ");
        System.out.println(str5.length());
        
        String str6=str5.toUpperCase(); 
        System.out.println(str6);
        
        str5=str5.trim();
        System.out.println(str5);
        
        String str7=str5.substring(3,6);
        System.out.println(str7);
        
        str5=str5.replace('e','m');
        System.out.println(str5);
        
        boolean s=str5.startsWith("nm");
        System.out.println(s);
        
        boolean z=str5.endsWith("b");
        System.out.println(z);
        
        System.out.println(str5.charAt(2));
        
        for(int i=0;i<str5.length();i++)
        {
            System.out.print(str5.charAt(i));
        }
        
        System.out.println(str5.indexOf("t",2));
        
        
        
        
        
    }
    
}
