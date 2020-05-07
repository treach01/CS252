package genericsexercises;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Exercise 1"); //create generic class with generic values
		Exercise1 Kovenda = new Exercise1(123, 252); //class includes getter and setters 
		Exercise1 Sydney = new Exercise1(231, "Data Science");
		System.out.println(Kovenda.getId());
		System.out.println(Kovenda.getMajor());
		System.out.println(Sydney.getId());
		System.out.println(Sydney.getMajor());
		
		System.out.println("Exercise 2"); //create generic interface that can polymorphically change based on implementation
		underGrad simon = new underGrad("new student", 2123);
		Grad john = new Grad();
		john.displayStd(2.34, "Well Hello mr. Sir");
		simon.displayStd("new Student", 2123);
		
		System.out.println("Exercise 3"); // create generic subclasses 
		Undergrad simon2 = new Undergrad("101", 252); //each constructor here includes console log of input parameters
		Graduate john2 = new Graduate(101, 252);
		
	}
}
