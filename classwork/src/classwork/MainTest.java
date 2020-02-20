package classwork;

public class MainTest {
	public static void main(String[] args) {
	Student andrew = new Student(69, 10, "Andrew");
	/*andrew.setId(10);
	andrew.setAge(69);
	andrew.setName("Andrew"); */
	Student greg = new Student(12, "Greg");
	System.out.println(Student.getstudentcount());
	}
}
