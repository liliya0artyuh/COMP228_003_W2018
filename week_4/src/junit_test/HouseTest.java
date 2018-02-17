package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

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
