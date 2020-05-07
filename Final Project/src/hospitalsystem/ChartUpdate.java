package hospitalsystem;

@FunctionalInterface
public interface ChartUpdate {
	void chart(Patient p, String data);
}
