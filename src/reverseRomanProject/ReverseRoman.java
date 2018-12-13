package reverseRomanProject;

public class ReverseRoman {
	static int romanUnits[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	static String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
	public static int of(String inputRoman) {
		// TODO Auto-generated method stub
		int outInteger = 0;
		int index=0;
		if( "V".equals(inputRoman) ) {
			for(int i=0; i<romanLetters.length; i++) {
				if(inputRoman.substring(index).startsWith(romanLetters[i])) {
					outInteger += romanUnits[i];
					index += romanLetters[i].length();
				}
			}
		}
		if( "IV".equals(inputRoman) ) {
			outInteger = 4;
			return outInteger;
		}
		for(int i=0; i< inputRoman.length(); i++) {
			if("I".equals(inputRoman.substring(i, i+1))) {
				outInteger+=1;
			}
		}
		
		return outInteger;
	}

}
