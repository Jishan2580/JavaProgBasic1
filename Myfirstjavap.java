
    class Answer{
	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){	
      this();
		System.out.println("you got "+marks+" for an "+ type);
	}
}
public class Myfirstjavap {

    public static void main(String[] args) {
        int a[] = new int[4];
        a=new int[6];
        int b[]={1,2,3,4,5};
        System.out.println(b[2]);
        Answer obj= new Answer(10,"jishan");
        String nptel,space ;
        nptel="jishan";
        space= "shaikh";
        System.out.println(nptel + space); 

        
        }
    }

    

    