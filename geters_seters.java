
public class geters_seters{
    public static void main(String args[]){
        Student st=new Student();
        st.setAge(18);
        st.setName("jishan");
        System.out.println(st.getAge());
        System.out.println(st.getName());
        ;
    }

}






class Student{
    private int age;
     private String name;
     
     void setAge(int age){
        this.age=age;
     }
     void setName(String name){
        this.name=name;
     }
     int getAge(){
        return age;
     }
     String getName(){
        return name;
     }

}