package AkLabpkg;
import java.util.Scanner;
public class Egx2_Ak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("-----Enter Your Details-----");
		
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=in.next();
        System.out.println("Name:"+name);
        System.out.println("Enter Your age:");
        int i=in.nextInt();
        System.out.println("Age:"+i);
        System.out.println("Enter Your Salary:");
        double d=in.nextDouble();
        System.out.println("Salary:"+d);
        in.close();
        

	}

}
