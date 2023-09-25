public class Java_Strings {
    public static void main(String args[]){
    String s1=new String("jishan");
    String s2 = new String("jishan");
    String s3= "jishan";
    String s4 = new String("JISHAN");
    String s5 ="jishan";
    System.out.println(s3==s5);
    System.out.println(s1==s3);
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s4));
    System.out.println(s3.equalsIgnoreCase(s4));
     s1= s1.concat("jishan");
    //String a1 ="PW";
    //String a1="PW" + "java";
    System.out.println(s1);


    }
    
}
