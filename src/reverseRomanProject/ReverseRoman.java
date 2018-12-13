package reverseRomanProject;

public class ReverseRoman {
	static int romanUnits[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	static String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
	public static int of(String inputRoman) {
		// TODO Auto-generated method stub
		int outInteger = 0;
		for(int index=0; index < inputRoman.length(); ) {
			for(int i=0; i<romanLetters.length; i++) {
				if(inputRoman.substring(index).startsWith(romanLetters[i])) {
					outInteger += romanUnits[i];
					index += romanLetters[i].length();
				}
			}
		}
		return outInteger;
	}

}
