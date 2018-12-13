package reverseRomanProject;

public class ReverseRoman {

	public static int of(String inputRoman) {
		// TODO Auto-generated method stub
		int outInteger = 0;
		if ( "II".equals(inputRoman) ) {
			outInteger = 2;
		}
		if ( "I".equals(inputRoman) ) {
			outInteger = 1;
		}
		
		return outInteger;
	}

}
