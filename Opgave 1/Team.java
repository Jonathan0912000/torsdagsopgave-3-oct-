import java.util.ArrayList;

public class Team {

    private String teamName;
    private int teamRank;
    private ArrayList<String> teamMembers;

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamMembers = new ArrayList<>(); 
    }

    public void addPlayer(String teamMembers) {
        this.teamMembers.add(teamMembers);
    }

    public void setRank(int teamRank) {
        this.teamRank = teamRank;
    }

    @Override
    public String toString() {
    	String players = String.join("\n", teamMembers);
        return "Hold: " + teamName + " Rang: " + teamRank + " \nMembers:\n " + teamMembers;
    }
}
