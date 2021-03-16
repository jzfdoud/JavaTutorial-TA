import Library.Collie;
import Library.Dog;
import Library.GermanShepard;
import Library.Mathematics;

public class Program {

	public static void main(String[] args) {

	GermanShepard gs = new GermanShepard("Mable", "woof", 5);
	gs.birthday();
	
	Collie col = new Collie("Rachel", "ruf", 15);
	col.birthday();
	
	Dog[] dogs = new Dog[] {gs, col};
	
	for(Dog dog : dogs){
		System.out.printf("Name: %s, Age: %d\n ", dog.getName(), dog.getAge(), dog.birthday());
	}
/*
	Mathematics math = new Mathematics(12, 3);
	math.add();
	math.sub();
	math.div();
	math.mult();
	math.mod();
	System.out.println("Pow: "+math.pow(12,3));
	}
*/

}
}
