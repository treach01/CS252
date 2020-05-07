package hospitalsystem;

@FunctionalInterface
public interface RequestPrescription {
	String requestDrugs(String p, Doctor d);
}
