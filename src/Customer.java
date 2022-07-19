public class Customer {

	private String penumper;
	private String name;
	private String document;
	private String birthday;

	public Customer(String name, String document, String birthday) {
		this.name = name;
		this.document = document;
		this.birthday = birthday;
		this.penumper = BankUtil.generateAccountID("PENUMPER");

	}

	public String getPenumper() {
		return penumper;
	}

	public void setPenumper(String penumper) {
		this.penumper = penumper;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
