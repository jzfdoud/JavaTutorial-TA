package Library;

public class Dog implements IBirthday {

	public void birthday() {
		System.out.println("Previous age: " + getAge());
		setAge(getAge()+1);
		System.out.println("Current age: " + getAge());
	}
	
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	private String bark;
	public String getBark() {return bark;}
	public void setBark(String bark) {
		this.bark = bark;
	}
	
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Dog(String name, String bark, int age) {
		super();
		this.name = name;
		this.bark = bark;
		this.age = age;
	}
	
	public Dog() {
		super();
	}
}
