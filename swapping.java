import java.lang.*;


public class swapping {

    
    public static void main(String[] args) {
        int a=9,b=12;
        
       a=a^b;
       b=a^b;
       a=a^b;
       
       System.out.println(a+" "+b);
       
       
       byte z=9,y=12;
       
       byte c;
        
       
       c=(byte)(z<<4);
       c=(byte)(c|y);
       
       System.out.println((c&0b11110000)>>4);
       System.out.println(c&0b00001111);
    }
    
}
