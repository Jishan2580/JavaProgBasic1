public class java_mutable_string {
    public static void main(String args[]){
    StringBuffer sb = new StringBuffer("jishan");
    System.out.println(sb);
    //StringBuffer a= "jishna"; invalid syntax
    sb.append("kohli");//doesnt require to reference variable like sb=sb.append()
    System.out.println(sb); 
    
    StringBuilder js = new StringBuilder();
    System.out.println(js.capacity());//gives the initial capacity of string as 16
    js.append("abcdefghijklmnop");
    System.out.println(js.capacity());
    js.append("12");
    System.out.println(js.capacity());


        
    }
    
}
