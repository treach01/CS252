package assignment9;

@FunctionalInterface
public interface StudentInt {
	void task1();
	default void task2() {
		System.out.println("Take exams");
	}
//	void task3();
}
