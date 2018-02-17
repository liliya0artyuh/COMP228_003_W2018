package enum_weather;

public class Driver {

	public static void main(String[] args) {
	
		Weather weather = new Weather();
		weather.setType(Type.COLD);

		
		System.out.println("the weather is " + weather.getType());
	}

}
