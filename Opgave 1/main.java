public class Main {
	public static void main(String[] args) {
		Team myTeam1 = new Team("FCK");
		Team myTeam2 = new Team("Bundby");
		Team myTeam3 = new Team("Nordsjælland");
		Team myTeam4 = new Team("Gaylatsaray");
		Team myTeam5 = new Team("OB");

		myTeam1.setRank(1);
		myTeam2.setRank(2);
		myTeam3.setRank(3);
		myTeam4.setRank(4);
		myTeam5.setRank(5);


		myTeam1.addPlayer("Jonathan");
		myTeam1.addPlayer("Eren");
		myTeam1.addPlayer("Marcus");
		myTeam1.addPlayer("Jonas");
		myTeam1.addPlayer("Daniel");

		myTeam2.addPlayer("Sarah");
		myTeam2.addPlayer("Michael");
		myTeam2.addPlayer("Alice");
		myTeam2.addPlayer("David");
		myTeam2.addPlayer("Emma");

		myTeam3.addPlayer("Liam");
		myTeam3.addPlayer("Olivia");
		myTeam3.addPlayer("Noah");
		myTeam3.addPlayer("Sophia");
		myTeam3.addPlayer("James");

		myTeam4.addPlayer("Lucas");
		myTeam4.addPlayer("Mia");
		myTeam4.addPlayer("Ethan");
		myTeam4.addPlayer("Charlotte");
		myTeam4.addPlayer("Benjamin");

		myTeam5.addPlayer("Lucas");
		myTeam5.addPlayer("Mia");
		myTeam5.addPlayer("Ethan");
		myTeam5.addPlayer("Charlotte");
		myTeam5.addPlayer("Benjamin");

		System.out.println(myTeam1);
		System.out.println(myTeam2);
		System.out.println(myTeam3);
		System.out.println(myTeam4);
		System.out.println(myTeam5);
	}
}
