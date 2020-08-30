public class EmployeeWage {

            private  int isFullTime;
	    private  int isPartTime;
	    private  int empRatePerHour;
	    
	    public EmployeeWage(final int isFullTime ,final int isPartTime,final int empRatePerHour)
	    {
	    	this.isFullTime=isFullTime;
	    	this.isPartTime=isPartTime;
	    	this.empRatePerHour=empRatePerHour;
	    }
	    
	    public void empWage()
	    {
	    	int empWage;
	    	int empHour=0;
	    	double empCheck = (int) ((Math.random()*10)%3);
	    	if(empCheck==isFullTime)
	    	{
	    		System.out.println("Employee is Present for Full time");
	    		empHour=8;
	    	}
	    	else if(empCheck==isPartTime)
	    	{
	    		System.out.println("Employee is Present for Part Time");
	    		empHour=4;
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
	    	EmployeeWage emp = new EmployeeWage(1,2, 20);
	    	emp.empWage();
       }

}
