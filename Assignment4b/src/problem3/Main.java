package problem3;

import java.util.Scanner;


public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000, 0.25);
		emps[0].createNewRetirement(9300);
		emps[2].createNewChecking(34000);
		emps[2].createNewSavings(27000, 0.25);
		emps[1].createNewChecking(10038);
		emps[1].createNewSavings(12600, 0.25);
		emps[1].createNewRetirement(9000);	
		
//		for phase I � console output
		String newline = "\n";
		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts " + newline + "B. Make a deposit" + newline + "C. Make a withdrawal" + newline + "Make a selection(A/B/C)");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("A"))
		{
			System.out.println("Its Case A");
			for(int i=0;i<3;i++) 
			{
				System.out.println("Emp name"+emps[i].getName());
				String info = emps[i].getFormattedAcctInfo();
				System.out.println(info);
				
			}
		}
		else if (answer.equalsIgnoreCase("B") ) {
			for (Employee e:emps) {
				int eidx = 0;
				System.out.println(eidx + "." + e.getName());
				++eidx;
			}
			System.out.println("Select an employee (type a number)");
			String uin = sc.next();
			switch(uin) {
				case "0":
					String x = emps[0].getFormattedAcctInfo();
					System.out.println(x);
				case "1":
					String y = emps[1].getFormattedAcctInfo();
					System.out.println(y);
				case "2":
					String z = emps[2].getFormattedAcctInfo();
					System.out.println(z);		
			}
		}
		else if (answer.equalsIgnoreCase("C")) {
			for (Employee e:emps) {
				int eidx = 0;
				System.out.println(eidx + "." + e.getName());
				++eidx;
			}
			System.out.println("Select an employee (type a number)");
			String uin = sc.next();
			switch(uin) {
				case "0":
					String x = emps[0].getFormattedAcctInfo();
					System.out.println(x);
				case "1":
					String y = emps[1].getFormattedAcctInfo();
					System.out.println(y);
				case "2":
					String z = emps[2].getFormattedAcctInfo();
					System.out.println(z);		
			}
			
		}
		else {
			//do nothing..the application ends here
		}				
	}
//	String getFormattedAccountInfo() {
//		String retVal = "";
//		for(int i = 0; i < emps.length; ++i){
//			retVal += (emps[i].getFormattedAcctInfo() + "\n");
//		}
//		return retVal;
//	}
}


