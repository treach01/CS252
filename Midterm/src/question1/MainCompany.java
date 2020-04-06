package question1;

public class MainCompany {
	public static void main(String args[])
	{
		
		Employee[] emps=new Employee[2];
		SalariedEmployee Will =new SalariedEmployee("William",1,"222-33-6525","321 Main St,31",30,"HR","HR work",2000,15);
		int[] emp1sales = {1,2,3,4};
		CommissionedEmployee Angela =new CommissionedEmployee("Angela",2,"111-33-6525","700 Collefe Drive",23,"Sale","Sale work",1400, emp1sales);
		emps[0] = Will;
		emps[1] = Angela;
		System.out.println(emps[0].getSalary());
		System.out.println(emps[0].totalSalary());
		System.out.println(emps[1].totalSalary());
	
	}

}
