package edabit;

public class Shuffle_Name {
	
	public static String nameShuffle(String s) {
		
		String[] p=s.split(" ");
		
		return p[1]+ " "+p[0];
	      
    }

	public static void main(String[] args) {
		nameShuffle("Donald Trump"); // "Trump Donald"

		nameShuffle("Rosie O'Donnell"); // "O'Donnell Rosie"

		nameShuffle("Seymour Butts"); // "Butts Seymour"

	}

}
