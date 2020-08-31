public class EmployeeWage {
       //constants
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	
	//variables
	private int empRatePerHour;
	private int totalDays;
	
	public EmployeeWage(final int empRatePerHour ,final int totalDays)
	{
		this.empRatePerHour=empRatePerHour;
		this.totalDays=totalDays;
	}
	
	//method to calculate wage
	public void empWage() {
		int totalEmpWage=0;
		for ( int day=1 ; day<=totalDays ; day++)
		{
		int empHour = empCheck();
		int empWage = empHour * empRatePerHour;
		totalEmpWage=totalEmpWage+empWage;
		System.out.println("day: "+ day + " Employee Wage: "+ empWage);
		}
		System.out.println( "Total Employee Wage: " + totalEmpWage);
	}

	 //method return type is integer
	public int empCheck() {
		int empHour = 0;
		int empCheck = (int) ((Math.random() * 10) % 3);
		switch (empCheck)  {
		case IS_FULL_TIME:
			System.out.println("Employee is Present for Full Time");
			empHour = 8;
			break;

		case IS_PART_TIME:
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
		EmployeeWage emp = new EmployeeWage(20, 20);
		emp.empWage();
      }
}
