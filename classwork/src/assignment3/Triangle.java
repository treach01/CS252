package assignment3;

public class Triangle {
	private double s1;
	private double s2;
	private double s3;
		
	//constructor
	public Triangle(double s1, double s2, double s3)
	{	this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;}

	public double area()
	{	double heron = (s1 + s2 +s3)/2;
		return (Math.sqrt(heron*(heron-s1)*(heron- s2)*(heron-s3)));}
	
	public double perimeter()
	{return s1 + s2 + s3; }

	public double getS1() {
		return s1;}
	public void setS1(int s1) {
		this.s1 = s1;}
	public double getS2() {
		return s2;}
	public void setS2(int s2) {
		this.s2 = s2;}
	public double getS3() {
		return s3;}
	public void setS3(int s3) {
		this.s3 = s3;	}
}
