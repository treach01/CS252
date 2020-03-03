package problem5;

public class Student implements Story, Readable {

	@Override
	public void Read() {
		System.out.println("Student Reads a story");}

	@Override
	public void tell() {
		System.out.println("Student Tells a story"); }

}
