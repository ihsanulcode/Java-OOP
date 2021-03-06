import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Declaring a Student type ArrayList
		ArrayList<Student> list = new ArrayList<Student>();
		
		//Declaring Student objects
		Student obj1 = new Student(201,"A",3.80,new double[] {12.5,10.5,15.0});
		Student obj2 = new Student(202,"B",3.50);
		Student obj3 = new Student(203,"C",3.20);
		
		//adding Student objects in list
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		//Sorting
		Collections.sort(list);
		
		//printing
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
		//Test Clone
		Student clone = (Student)obj1.clone();
		System.out.println("Clone:");
		System.out.println(clone.toString());
		
		//Testing deep copy
		clone.marks[0] = 15.5;
		System.out.println(clone.toString());
		

	}

}
