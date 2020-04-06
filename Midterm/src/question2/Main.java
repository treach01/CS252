package question2;

public class Main {
	public static void main(String[] args) 
	{
	Pdf newfile = new Pdf();
	newfile.setSize(2);
	newfile.setName("midterm problem");
	System.out.println("file name is " + newfile.filename());
	System.out.println("file size is" + newfile.size());
	System.out.println("file contents are listed below:");
	newfile.content();			
	}

}

