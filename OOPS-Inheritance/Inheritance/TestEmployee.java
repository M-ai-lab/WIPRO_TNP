public class TestEmployee{
	public static void main(String[] args){
		Employee e=new Employee("Rahul",750000,2023,"NI12345");
		System.out.println("Name: "+e.getName());
		System.out.println("Annual Salary: "+e.getAnnualSalary());
		System.out.println("Year Started: "+e.getYearStarted());
		System.out.println("National Insurance Number: "+e.getNationalInsuranceNumber());
	}
}