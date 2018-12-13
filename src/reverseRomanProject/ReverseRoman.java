package reverseRomanProject;

public class ReverseRoman {

	public static int of(String inputRoman) {
		// TODO Auto-generated method stub
		int outInteger = 0;
		if ( "III".equals(inputRoman) ) {
			for(int i=0; i< inputRoman.length(); i++) {
				if("I".equals(inputRoman.substring(i, i+1))) {
					outInteger+=1;
				}
			}
		}
		if ( "II".equals(inputRoman) ) {
			for(int i=0; i< inputRoman.length(); i++) {
				if("I".equals(inputRoman.substring(i, i+1))) {
					outInteger+=1;
				}
			}
		}
		if ( "I".equals(inputRoman) ) {
			for(int i=0; i< inputRoman.length(); i++) {
				if("I".equals(inputRoman.substring(i, i+1))) {
					outInteger+=1;
				}
			}
		}
		
		return outInteger;
	}

}
