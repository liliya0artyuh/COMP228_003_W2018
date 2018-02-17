package inheritance;

public class Driver {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.setType("bird");
		Dog d = new Dog();
		d.setType("dog");
		Fish f = new Fish("fish");
		b.sleep();
		d.sleep();

		b.fly();
		d.run();
		
		
		System.out.println("----------------");
		d.move();
		f.move();
	}
}
