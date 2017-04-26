
/**
 * @author Gustavo
 * 
 * This class verify if the first Character is UpperCase
 * 
 * The ASC code to characters Upper case from A to Z is from 65 to 90 
 * http://www.asciitable.com
 * 
 */
public class StartsWithUpperCase {

	public static void main(String[] args) {

		String upperCase = "";
		
		if(isFirstCharacterUpperCase(upperCase)){
			System.out.println("UpperCase");
		}else {
			System.out.println("NOT UpperCase");
		}
	}

	private static boolean isFirstCharacterUpperCase(String upperCase) throws StringIndexOutOfBoundsException {
		
		return(Character.isUpperCase(upperCase.charAt(0)));

	}

}
