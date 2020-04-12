import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner work = new Scanner (System.in);
		
		
		System.out.println("please enter the size of array:");
		int size = work.nextInt();
		String[] nameOfEmployee = new String[size];
		System.out.println("please enter the name of employee");
		for(int a = 0; a<nameOfEmployee.length;a++) {
			System.out.println("list of employee at index :"+ a + " is " + (nameOfEmployee[a] =work.next()));
		}
		
		
	for(int k = 0; k<nameOfEmployee.length;k++) {
		System.out.println(nameOfEmployee[k]);
	
		
	}

	}}
