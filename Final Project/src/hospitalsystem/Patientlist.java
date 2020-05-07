package hospitalsystem;

@FunctionalInterface
public interface Patientlist<T> {
	void addPatient(T t);
}
