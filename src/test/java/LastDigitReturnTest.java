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
}
