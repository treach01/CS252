package assignment3;

public class Average {
	private double input[];
	private int count = 0;
//	private double average;
	
	public void addnum(double x) {
		this.input[count] = x;
		count++;}
	
	public double average() {
		double sum = 0;
		for (int i = 0; i < count; i++)
			{ sum = sum + input[i];}
		double avg = sum /count ;
		return avg;} }
	

	
	

