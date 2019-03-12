import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest {

	@Test
	public void toStringtest() {	
		SickPerson a = new SickPerson("Lindsey", 14, 4);
		Assert.assertEquals("Lindsey, a 14-year old. Severity level 4", a.toString());	// test for toString
	}
	
	public void compareTest() {
		SickPerson a = new SickPerson("Bob", 15, 1);	// test for compareTest
		SickPerson b = new SickPerson("Terry", 12, 2);
		SickPerson c = new SickPerson("Fish", 13, 2);
		
		Assert.assertEquals(-1, a.compareTo(b));
		Assert.assertEquals(1, b.compareTo(a));
		Assert.assertEquals(0, b.compareTo(c));
	}

}
