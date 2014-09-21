HackExcercises
==============
public class ExcerciseTwo {

	
	public static void main(String[] args) {
		System.out.println(ABCheck("Laura Sob"));
		System.out.println(ABCheck("bogdana"));	//according to the requirement this should return true too
	}

	private static boolean ABCheck(String input) {
		for(int i = 0; i<input.length()-3; i++){
			if(input.charAt(i)=='a' && input.charAt(i+4)=='b') return true;
			else if(input.charAt(i)=='b' && input.charAt(i+4)=='a') return true;
		}
		return false;
	}

}
