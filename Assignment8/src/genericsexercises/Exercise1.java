package genericsexercises;

public class Exercise1<T> {
	T id;
	T major;
	
	public Exercise1(T id, T major) {
		this.id = id;
		this.major = major;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public T getMajor() {
		return major;
	}

	public void setMajor(T major) {
		this.major = major;
	}
	
}
