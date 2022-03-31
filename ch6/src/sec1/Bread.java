package sec1;

public class Bread {
	private String name;
	private String matrial;
	private int price;
	private int gram;
	private int cnt;
	
	Bread(){
		this("»§");
	}
	Bread(String name){
		this(name, "¹Ð°¡·ç");
	}
	Bread(String name, String matrial){
		this(name, matrial, 1000);
	}
	Bread(String name, String matrial, int price){
		this(name, matrial, price, 100);
	}
	Bread(String name, String matrial, int price, int gram){
		this(name, matrial, price, gram, 1);
	}
	
	Bread(String name, String matrial, int price, int gram, int cnt){
		this.name = name;
		this.matrial = matrial;
		this.price = price;
		this.gram = gram;
		this.cnt = cnt;
	}
	
	
	public int tot () {
		return this.price*this.cnt;
	}
	
	public int tot (int price) {
		return price*this.cnt;
	}
	
	public int tot (int price, int cnt) {
		return price*cnt;
	}
	
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatrial() {
		return matrial;
	}
	public void setMatrial(String matrial) {
		this.matrial = matrial;
	}
	public int getGram() {
		return gram;
	}
	public void setGram(int gram) {
		this.gram = gram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	

	

}
