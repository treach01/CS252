package problem4;

public class Student extends Affiliation implements Interests, Person {
	private String name;
	private String job;
	private String sport;

	@Override
	public void Profession(String title) {
		System.out.println("My job is" + title);}

	@Override
	public void Sports(String sportname) {
		System.out.println("My favorite sport is" + sportname);}
	
	
	public Student() {}
	
	public Student(String name, String job, String sport) {
		this.name = name;
		this.job = job;
		this.sport = sport;}
	
	@Override
	public String toString() {
		return name + " "+ job + " " + sport;
	}
}
