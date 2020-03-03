package exercise3_3_1;

public class Test {
	public static void main(String[] args) {
//	Document doc = new Document() ;
	Pdf myoop = new Pdf();
	MSword mywrd = new MSword();
	myoop.setName("myoop");
	mywrd.setName("mywrd");
	Document[] docarry = new Document[2];
	docarry[0] = myoop;
	docarry[1] = mywrd;	
	for (Document a:docarry) {
		System.out.println(a);
	}
	
	}
}
