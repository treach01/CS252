package question2;

public abstract class Document implements Memory, File {
	private String name;
	private int size;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private String content;

	@Override
	public String filename() {
		return name;
	}

	@Override
	public void content() {
		System.out.println("Here are my contents");

	}

	@Override
	public int size() {
		return size;
	}

}
