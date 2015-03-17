import static org.junit.Assert.*;
import org.junit.Test;

public class LuhnsAlgorithmCheck {
	@Test
	public void test1() {
		LuhnsAlgorithm card1 = new LuhnsAlgorithm("79927398710");
		LuhnsAlgorithm card2 = new LuhnsAlgorithm("79927398711");
		LuhnsAlgorithm card3 = new LuhnsAlgorithm("79927398712");
		
		assertEquals("Expected this number to be valid, got false", true, card1.isValid());
		assertEquals("Expected this number to be valid, got false", true, card2.isValid());
		assertEquals("Expected this number to be valid, got false", true, card3.isValid());
	}
}