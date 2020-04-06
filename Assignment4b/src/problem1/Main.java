package problem1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Professor shad = new Professor(10, 50000.0);
		shad.setName("shad");
		shad.setHiredate("2018");
		Professor alan = new Professor(10, 70000.0);
		alan.setName("alan");
		alan.setHiredate("2018");
		Professor mike = new Professor(10, 100.0);
		mike.setName("mike");
		mike.setHiredate("1990");
		Seceratary john = new Seceratary(200, 20000.0);
		john.setName("john");
		john.setHiredate("1990");
		Seceratary angela = new Seceratary(200, 40000.0);
		angela.setName("angela");
		angela.setHiredate("2000");
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = shad;
		department[1] = alan;
		department[2] = mike;
		department[3] = john;
		department[4] = angela;
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to see the sum of the department's salaries? (y/n)");
		String n = in.next();
		in.close();
		double total = 0.0;
		if (n.equals("Y")) {
			for(DeptEmployee a:department) {
				total += a.computeSalary(); }
			}
		System.out.println(total);
		}
	}
