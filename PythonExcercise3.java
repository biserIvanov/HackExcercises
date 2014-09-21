HackExcercises
==============
public class ExcerciseThree {
	
	public static void main(String[] args) {
		System.out.println(dashInsert(940384733));
	}

	private static String dashInsert(int i) {
		int flag1 = 0;
		String input = Integer.toString(i);
		char[] arr = input.toCharArray();
		for(int j = 0; j<arr.length-1; j++){
			int temporary = Character.getNumericValue(arr[j]);
			int temporaryPlus = Character.getNumericValue(arr[j+1]);
			if(temporary % 2 != 0 && temporaryPlus % 2 != 0){
				String beginning = input.substring(0, j+1+flag1);
				String ending = input.substring(j+1+flag1);
				input = beginning + "-" + ending;
				flag1++;
				
			}
		}
		return input;
	}

}
