public class EmployeeWage {
   
	       //constants
            private static final int ISFULLTIME=1;
	    private static final int ISPARTTIME=2;
		
           //variables
	    private  int empRate;
		
	    public EmployeeWage(final int empRate)
	    {
	    	this.empRate=empRate;
	    }
	    
		public void empWage() {
			int empHour = empCheck();
			int empWage = empHour * empRate;
			System.out.println("Employee Wage: " + empWage);
		}

		public int empCheck() {
			int empHour = 0;
			int empCheck = (int) ((Math.random() * 10) % 3);
			switch (empCheck) {
			case ISFULLTIME:
				System.out.println("Employee is Present for Full Time");
				empHour = 8;
				break;

			case ISPARTTIME:
				System.out.println("Employee is Present for Part Time");
				empHour = 4;
				break;

			default:
				System.out.println("Employee is Absent");
				empHour = 0;
			}
			return empHour;

		}

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
			EmployeeWage emp = new EmployeeWage(20);
			emp.empWage();

		}
}
