package homework;

public class Constructor {
	// Global variable
	int employeeId;
	String employeeName;
	float salary;
	  // Non parameterised constructor
	Constructor(){
		employeeId=2000;
		employeeName="Ramesh";
		salary=15000.23f;
	}
		Constructor(int a,String str){ // parameterised constructor
		employeeId=a;
			employeeName=str;
		}
		Constructor(int a,float b){ //parameterised constructor
			
		 employeeId=a;
		salary=b;
		}
		

	public void test1() { // non static method
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		c.test1();
		
		Constructor c1=new Constructor(1234,"omkar");
		c1.test1();
		
		Constructor c2=new Constructor(20,56123.45f);
		c2.test1();
	}
	}


