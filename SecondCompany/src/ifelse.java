import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
	
	Scanner student = new Scanner(System.in);
	double response, ansawer = 20;
	boolean questionAnsawered = false;
	
	for (int i= 1;i<=3;i++) {
	System.out.println("maths test");
	System.out.println ("what is 2 * 10 (3 attempt):");
	
	response = student.nextDouble();
		if (response == ansawer) {
			questionAnsawered = true;
			break;
		}}
	
		if (questionAnsawered) {
			System.out.println("well done");}
		else
			System.out.println("no worries  , try again");
		
}}
