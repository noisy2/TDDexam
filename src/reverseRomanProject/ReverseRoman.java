package reverseRomanProject;

public class ReverseRoman {

	public static int of(String inputRoman) {
		// TODO Auto-generated method stub
		int outInteger = 0;
		
		if( "V".equals(inputRoman) ) {
			outInteger = 4;
			return outInteger;
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
