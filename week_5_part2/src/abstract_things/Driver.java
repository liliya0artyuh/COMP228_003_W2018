/**
 * 
 */
package abstract_things;

/**
 * @author lartyukh
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal anAnimal= new Animal("Dog");
		anAnimal.setColor("green");
		anAnimal.setEyes(6);*/
		
		Dog adog= new Dog("chico");
		System.out.println(adog.toString());
		
		System.out.println(Animal.myStaticVar);
		
	
		
		
		//System.out.println(anAnimal.toString());
	}

}
