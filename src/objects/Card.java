package objects;

public class Card {

	private String type;
	private String value;
	
	public Card(String type, String value) {
		super();
		this.type = type;
		this.value = value;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return  getValue() + " of " + getType();
	}
	
}
