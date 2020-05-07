package assignment9;

public class Main {

	public static void main(String[] args) {
		StudentInt stu = new StudentClass();
		stu.task1();
		
		StudentInt stu1 = new StudentInt() {

			@Override
			public void task1() {
				System.out.println("Submit Assignments");
				
			}
	};
	StudentInt stu2 = () -> {
		System.out.println("Submit Assigments");
		
	};

}
}
