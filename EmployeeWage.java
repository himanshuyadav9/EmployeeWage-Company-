public class EmployeeWage {
                               //constants
				private static  final int IS_FULL_TIME = 1;
				private static  final int IS_PART_TIME = 2;
				
				//variables
				private  String CompanyName;
				private  int empRatePerHour;
				private  int totalDays;
				private  int maxHourInMonth;
				
				public EmployeeWage(final int empRatePerHour ,final int totalDays ,final int maxHourInMonth, final String CompanyName )
				{
					this.empRatePerHour=empRatePerHour;
					this.totalDays=totalDays;
					this.maxHourInMonth=maxHourInMonth;
					this.CompanyName=CompanyName;
				}


			// method to calculate employee wage
			    public int empWage() {

				// variables
				int totalEmpWage = 0;
				int totalEmpHrs = 0;
				int totalWorkingDays = 0;

				// while is used for till a condition type
				while (totalEmpHrs < maxHourInMonth && totalWorkingDays < totalDays) {
					totalWorkingDays++;
					final int empHour = empCheck();
					final int empWage = empHour * empRatePerHour;
					totalEmpHrs = totalEmpHrs + empHour;
					totalEmpWage = totalEmpWage + empWage;
					//System.out.println("day: " + totalWorkingDays + " Employee Wage: " + empWage);
				}
				return totalEmpWage;
			}

			// empCheck method to get empHour
			public int empCheck() {

				int empHour = 0;
				int empCheck = (int) ((Math.random() * 10) % 3);
				switch (empCheck) {
				case IS_FULL_TIME:
					empHour = 8;
					break;

				case IS_PART_TIME:
					empHour = 4;
					break;

				default:
					empHour = 0;
				}
				return empHour;

			}

			// main method to create an object to class and call method
			public static void main(String[] args) {
				System.out.println("Welcome to Employee Wage Computation");
				EmployeeWage tata = new EmployeeWage(20, 20, 100, "Tata");
				 final int tataEmpWage= tata.empWage();
				System.out.println("Total Employee Wage tata: "  + tataEmpWage );
	    
				EmployeeWage hyund = new EmployeeWage(20, 30, 90, "hyundai");
				final int hyundaiEmpWage= hyund.empWage();
				System.out.println("Total Employee Wage Hyundai: " + hyundaiEmpWage );

			}
}
