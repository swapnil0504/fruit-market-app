
public class FruitItem {
	
	private String code;
	
	private int price;
	
	private String description;
	
	

	public FruitItem() {
		super();
	}

	public FruitItem(String code, int price, String description) {
		super();
		this.code = code;
		this.price = price;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
