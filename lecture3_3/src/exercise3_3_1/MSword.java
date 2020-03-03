package exercise3_3_1;

public class MSword extends Document implements MemoryAllocation, Type {
	
	@Override
	String display() {
		return super.getName();
	}

	@Override
	public String DefineType() {
		return "word";
	}

	@Override
	public String AllocateMemory() {
		return "50 mb";
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
