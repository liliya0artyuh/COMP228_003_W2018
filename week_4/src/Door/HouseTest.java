package Door;

import static org.junit.Assert.*;

import org.junit.Test;

import junit_test.Door;
import junit_test.House;

public class HouseTest {

	@Test
	public void testGetDoor() {
	House house = new House();
	
	String color = "green";
	
	Door door = new Door();
			door.setColor(color);
	
	house.setDoor(door);
	
	assertEquals(color, house.getDoor().getColor());
	}

}
