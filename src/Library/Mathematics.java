package Library;

public class Mathematics {
	
	public Mathematics(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void add() {
		setAnswer(getX()+getY());
		System.out.println("Add: "+ getAnswer());
	}
	public void sub() {
		setAnswer(getX()-getY());
		System.out.println("Sub: "+ getAnswer());
	}
	public void div() {
		setAnswer(getX()/getY());
		System.out.println("Div: "+ getAnswer());
	}
	public void mult() {
		setAnswer(getX()*getY());
		System.out.println("Product: "+ getAnswer());
	}
	public void mod() {
		setAnswer(getX()-(getX()/getY()*getY()));
		System.out.println("Mod: "+ getAnswer());
	}
	public int pow(int x, int y) {
				int power =1;
				for( int i =0; i < y; i++) {
					power *= x;
				}
				return power;
	}
	
	
	public int x;
	public int y;
	public int answer;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
	
	
	public Mathematics() {
		super();
	}
}
