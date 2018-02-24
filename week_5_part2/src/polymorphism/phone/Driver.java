package polymorphism.phone;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		ArrayList<Phone> phoneList = new ArrayList<>();
		phoneList.add(new CellPhone(1111111111L));
		phoneList.add(new CellPhone(2222222222L));
		phoneList.add(new LandLine(9999999999L));
		
		callService(phoneList, new LandLine(123456789L));
	}
	
	private static void callService(ArrayList<Phone> phoneList, Phone phoneToCall) {
		for (Phone p : phoneList) {
			p.call(phoneToCall);
		}
	}
}
