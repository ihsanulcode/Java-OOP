/*(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6
kilometers.)*/
public class Task2 {

	public static void main(String[] args) {
		double miles = 14/1.6;
		double hours = (45/60)+(30/3600);
		double average = miles/hours;
		System.out.println("Average speed is" +average);

	}

}
