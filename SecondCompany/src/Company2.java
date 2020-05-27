
public class Company2 {

		String name ="jeorge";                  // instance variable         (declared inside class but outside method)
		int age= 23;                      //instance variable
	

		static int employeeId = 3421;             // static variable
		
		public int getSalary()
		
		{
			int salary =6000;                    // local variable 
			int tax = 80;                         // local variable              (declared inside method)
			salary = salary - tax;
			return salary;

		
		}
		
public static void main(String[] args) 

{
	
	Company2 c= new Company2();
	System.out.println(c.getSalary());
	}
			
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	


