package reverseRomanProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanTest {

	@Test
	void number_should_be_1_for_I() {
		assertEquals(1, ReverseRoman.of("I"));
	}
	
	@Test
	void number_should_be_2_for_II() {
		assertEquals(2, ReverseRoman.of("II"));
	}

}
