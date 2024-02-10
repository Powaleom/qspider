/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smallest_of4number;

public class Smallest_of4number {
            public static float small(float a,float b,float c,float d)
            {
                float temp;
                if(a<b && a<c && a<d)
                {
                    temp=a;
                   
                }
                else if(b<c&&b<d)
                {
                    temp=b;
                }
                else if(c<d)
                {
                    temp=c;
                }
                else{
                    temp=d;
                }
                return temp;
            }
  
    public static void main(String[] args) {
        System.out.println("Smallest number");
        System.out.println(small(55.77f,77.55f,-87.67f,45.54f));
        System.out.println(small(55.77f,77.55f,-87.67f,45.54f));
        System.out.println(small(55.77f,77.55f,-87.67f,45.54f));
    }
    
}
