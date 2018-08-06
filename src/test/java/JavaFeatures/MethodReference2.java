package JavaFeatures;
import JavaFeatures.MethodReference1;

interface test
{
	void display();
	
}

public class MethodReference2 {
	
public static void main(String[] args) {
	
	test test1 = MethodReference1::displayStatic;
	test1.display();
	
	System.out.println();
	
	test test2 = new MethodReference1()::displayInstance;
	test2.display();
	
	System.out.println();
	
	test test3 = MethodReference1::new;
	test3.display();
	
	System.out.println();
	//below code is for Lamda Expression
	
	test test4 = () -> { System.out.println("This is for Lambda Expression");};
	test4.display();
	
	
}

}
