package regasa;

import java.util.Scanner;

public class world {

	public static void main(String[] args) {
	Scanner Jerry = new Scanner (System.in);
	 System.out.println("please enter your name :");
     String name = Jerry.nextLine();
	System.out.println("please enter your salary :");	
	int salary =Jerry.nextInt ();
	System.out.println("please enter your bonus :");
	double bonus =Jerry.nextDouble();

 
    double total_salary = salary+bonus; 
	
	
	
 
	 System.out.println("The name of the employee is : " + name);
	 System.out.println("The salary of the employee is : " + salary);
	 System.out.println("The bonus of the employee is : " + bonus);
	 System.out.println("The total salary of the employee is : " + total_salary);
 
	
	
	}
}


