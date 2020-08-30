public class EmployeeWage {
 private  int isPresent;
	 private  int empRatePerHour;
	     public EmployeeWage(final int isPresent ,final int empRatePerHour  )
	     {
	    	 this.isPresent=isPresent;
	    	 this.empRatePerHour=empRatePerHour;
	     }
	    public void empWage()
	    {
	    	int empWage;
	    	int empHour=0;
	    	double empCheck = (int) ((Math.random()*10)%2);
	    	if(empCheck==isPresent)
	    	{
	    		System.out.println("Employee is Present");
	    		empHour=8;
	    	}
	    	else
	    	{
	    		System.out.println("Employee is Absent");
	    	}
	    	empWage=empHour*empRatePerHour;
	    	System.out.println("Employee Wage: " + empWage);
	    	
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation");
	    	EmployeeWage emp = new EmployeeWage(1 , 20);
	    	emp.empWage();
   }

}
