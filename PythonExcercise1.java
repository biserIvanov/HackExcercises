HackExcercises
==============
public class ExcerciseOne {

	
	public static void main(String[] args) {
		System.out.println(ExOh(""));
	}

	private static boolean ExOh(String input){
		int xNum = 0;
		int oNum = 0;
		for(int i = 0; i<input.length(); i++){
			if(input.charAt(i)=='o'){
				oNum++;
			}else xNum++;
		}
		if(xNum==oNum) return true;
		else return false;
		
	}

}
