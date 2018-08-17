package ComparatorTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReverseUsingComparator  {
	
	@Test
	public  void test() {
		
		//StudentDetails s1 = new StudentDetails("Sneha", 1, "CE");
		//StudentDetails s2 = new StudentDetails("Srishti", 1, "ME");
		//StudentDetails s3 = new StudentDetails("Pooja", 1, "IT");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		LinkedList<StudentDetails> list = new LinkedList<StudentDetails>();
		
		list.add(new StudentDetails("Sneha", 1, "CE"));
		list.add(new StudentDetails("Srishti", 1, "ME"));
		list.add(new StudentDetails("Pooja", 1, "IT"));
		
		list.forEach((element) -> System.out.println("Original Elements:  "  + element.name + "  " + element.rollno + " " +  element.branch));
		
		Collections.sort(list, Collections.reverseOrder(new NameComparator()));
		
		list.forEach((element) -> System.out.println("Reverse Elements:  "  + element.name + " " + element.rollno + " "  + element.branch));
	}

}
