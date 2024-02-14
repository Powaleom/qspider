
class exam1{
    public static String conen(String str1,String str2)
    {
        return str1+str2;
    }

    public static String conen(String str3,String str4,String str5)
    {
        return str3+str4+str5;
    }
    public static String conen(String str6,String str7,String str8,String str9)
    {
        return str6+str7+str8+str9;
    }
    public static void main(String[] args)
    {
      
        String result1=conen("Hello,", "World");
        System.out.println("result1"+result1);
        String result2=conen("Java", "is","awesome!!");
        System.out.println("result2"+result2);
        String result3=conen("java", "1st","Mock","Interview");
        System.out.println("result2"+result3);
}
}