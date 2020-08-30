public class EmployeeWage {
                 //constant
		private  int isPresent;
	    public EmployeeWage(final int isPresnent)
	    {
	    	this.isPresent=isPresent;
	    }
	    //to generate random values	
		public void randomCheck() {
			double empCheck = (int) ((Math.random() * 10) % 2);
			if (empCheck == isPresent) {
				System.out.println("Employee is Present");
			} else {
				System.out.println("employee is Absent");
			}
		}

		public static void main(String[] args) {
			
			//printing welcome message
			System.out.println("Welcome to Employee Wage Computation");
			EmployeeWage emp = new EmployeeWage(1);
			emp.randomCheck();
		}
}
