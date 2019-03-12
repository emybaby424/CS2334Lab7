
import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest {

	@Test
	public void toStringtest() {	
		HealthyPerson a = new HealthyPerson("Mia", 30, "Work");
		Assert.assertEquals("Mia, a 30-year old. In for Work", a.toString());	// test for toString
	}
	
	@Test
	public void compareTest() {
		HealthyPerson a = new HealthyPerson("Fred", 44, "Work");	// test for compareTest
		HealthyPerson b = new HealthyPerson("Tim", 12, "Visit");
		HealthyPerson c = new HealthyPerson("Tim", 12, "Depression");
		
		Assert.assertEquals(-1, a.compareTo(b));
		Assert.assertEquals(1, b.compareTo(a));
		Assert.assertEquals(0, b.compareTo(c));
	}

}
