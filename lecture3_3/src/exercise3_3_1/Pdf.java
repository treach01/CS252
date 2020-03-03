package exercise3_3_1;

public class Pdf extends Document implements MemoryAllocation, Type  {
	
	@Override
	String display() {
		return super.getName();
	}

	@Override
	public String DefineType() {
		return "pdf";
	}

	@Override
	public String AllocateMemory() {
		return "20 mb";
	}
	
	@Override
	public String toString() {
		String name = super.getName();
		String disp = display();
		String allm = AllocateMemory();
		String type = DefineType();
		return name + disp + allm + type;
	}

}
