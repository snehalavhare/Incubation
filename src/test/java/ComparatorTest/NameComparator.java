package ComparatorTest;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentDetails>
{
	
public int compare(StudentDetails s1, StudentDetails s2)
{
	
	return s1.name.compareTo(s2.name);
}

}
