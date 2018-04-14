package chained;

public class MainClassWithoutChaning {
	 
    public static  void main(String[] args) throws Exception {
        getLeave();
    }
 
    static void getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            e.printStackTrace();
            throw new NoLeaveGrantedException("Leave not sanctioned.");
        }
    }
 
   static void howIsTeamLead() throws TeamLeadUpsetException {
        throw new TeamLeadUpsetException("Team Lead Upset");
    }
}