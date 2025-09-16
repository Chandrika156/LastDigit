import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastDigitReturnTest {
	@Test
	public void testCase1() {
		Assertions.assertEquals(6,LastDigitReturn.lastDigitReturn(156));
	}
	@Test
	public void testCase2() {
		Assertions.assertEquals(6,LastDigitReturn.lastDigitReturn(-156));
	}
	@Test
	public void testCase3() {
		Assertions.assertEquals(3,LastDigitReturn.lastDigitReturn(-33));
	}
	@Test
	public void testCase4() {
		Assertions.assertEquals(2,LastDigitReturn.lastDigitReturn(2882));
	}
}
