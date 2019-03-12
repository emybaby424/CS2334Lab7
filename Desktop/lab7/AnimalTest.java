
import org.junit.Test;
import org.junit.Assert;


public class AnimalTest {

	/**
	 * Test for constructor and test
	 */
	@Test
	public void constructorTest() {
		Animal a = new Animal("Rabbit", 2);
		Animal b = new Animal("Lion", 5);
		Animal c = new Animal("Fish", 1);
		
		Assert.assertEquals("Fish", c.getBreed());
		Assert.assertEquals("Lion", b.getBreed());
		
		Assert.assertEquals(2, a.getAge());
		Assert.assertEquals(1, c.getAge());
		
	}
	
	public void toStringTest() {
		Animal a = new Animal("Rabbit", 2);
		Animal b = new Animal("Lion", 5);
		
		Assert.assertEquals("A 2-year old Rabbit.", a.toString());
		Assert.assertEquals("A 5-year old Lion.", b.toString());
		
	}
	
	public void compareToTest() {
		Animal a = new Animal("Rabbit", 10);
		Animal b = new Animal("Lion", 5);
		Animal c = new Animal("Fish", 5);
		
		Assert.assertEquals(5, a.compareTo(b));
		Assert.assertEquals(0, b.compareTo(c));
		Assert.assertEquals(-5, c.compareTo(a));
	}

}
