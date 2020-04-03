import java.util.Scanner;

public class Greeting_from_Netsanet {
	
	public static	void main(String[] args) {
		/*String name = "James";
		int salary =1200;
		double bonus = 230.0;*/
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name =in.nextLine();
		
		System.out.println("Please enter your salary: ");
		Integer salary =in.nextInt();
		
		System.out.println("Please enter yor bonus: ");
		double bonus =in.nextDouble();
		
		double total_salery = salary+bonus; 
		System.out.println ("Total Salary: " + total_salery);

}
}
