import java.util.Comparator;

public class Teacher implements Comparable<Teacher>
{
	private int id;
	private String firstName;
	private String lastName;

public Teacher(int id, String firstName,String lastName)
{
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	
}
	@Override
	public int compareTo(Teacher o) {
		int result=this.id-o.id;
		if(result==0)
			result=this.firstName.compareTo(o.firstName);
		if(result==0)
			result=this.lastName.compareTo(o.lastName);
		return result;
	}
public static Comparator<Teacher> FirstNameComparator=new Comparator<Teacher>() {
	
	@Override
	public int compare(Teacher o1, Teacher o2) {
		return o1.firstName.compareTo(o2.firstName);
	}
};
}
