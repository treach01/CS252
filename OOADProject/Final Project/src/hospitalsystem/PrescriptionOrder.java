package hospitalsystem;

@FunctionalInterface
public interface PrescriptionOrder {
	void orderPrescription(String presc, float price, Patient p);
}
