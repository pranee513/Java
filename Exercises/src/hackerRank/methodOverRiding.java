package hackerRank;





class Sports {
	String getName() {
		return "General Sports";
	}
	
	void getNumberOfTeamMemmbers() {
		System.out.println("Each team has n playesr"+getName());
	}
	
}


class Soccer extends Sports {
	String getName() {
		return "Soccer class";
	}
	void getNumberOfTeamMemmbers() {
		System.out.println("Each team has 11 players"+getName() );
	}
}

public class methodOverRiding {

	public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMemmbers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMemmbers();
	}
	
	}
