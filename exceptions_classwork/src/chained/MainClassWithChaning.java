package chained;

public class MainClassWithChaning {
	public static void main(String[] args) throws Exception {
		getLeave();
	}

	public static void getLeave() throws NoLeaveGrantedException {
	        try {
	            howIsTeamLead();
	        } catch (TeamLeadUpsetException e) {
	        	//adding exception occured to the new exception
	             throw new NoLeaveGrantedException("Leave not sanctioned.", e);
	        }
	    }

	public static void howIsTeamLead() throws TeamLeadUpsetException {
		throw new TeamLeadUpsetException("Team lead Upset.");
	}
}