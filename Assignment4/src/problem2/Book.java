package problem2;

public abstract class Book {
	protected String title;
	protected int pages;
	protected String Author;
	protected String Publiser;
	protected int copies;
	protected int price;
	
	public int pricepercopy()
	{ return copies/price;}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPubliser() {
		return Publiser;
	}

	public void setPubliser(String publiser) {
		Publiser = publiser;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
