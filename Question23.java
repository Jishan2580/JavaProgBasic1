public class Question23{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		Question23 q = new Question23();
		// Print method on object of Question class is called
		q.studentMethod();
    }
	
	// 'print()' method is defined in class Question
	void print(Question23 object){
		System.out.print("Well Done!");
	}
    static void studentMethod(){
        Question23 obj2= new Question23();
obj2.print(obj2);
}
}
