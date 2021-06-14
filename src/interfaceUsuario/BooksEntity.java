package interfaceUsuario;

public class BooksEntity {

	private Integer id;
	private String title;
	private String author;
	private Float price;
	private Integer qty;
	
	public BooksEntity() {}

	public BooksEntity(Integer id, String title, String author, Float price, Integer qty) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "\ntitle: " + this.title + "\nauthor: " + this.author + 
				"\nprice: " + this.price + "\nquantity: " + this.qty;
	}
	
	
}
