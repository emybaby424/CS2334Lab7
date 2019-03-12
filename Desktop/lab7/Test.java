import org.junit.Assert;

/**
 * Lab 7
 *
 * Test class for Person Animal and Hospital.
 *
 * @author Emily
 * @version 2019-03-11
 */

public class Test {
	/**
	 * Test constructors and getters
	 */
	
	public void constructorTester() {
		SickPerson a = new SickPerson("Jeff", 14, 1);	// testing SickPerson
		SickPerson b = new SickPerson("Bob", 18, 4);
		
		Assert.assertEquals("Jeff", a.getName()); // testing getName
		Assert.assertEquals(14, a.getAge());	// testing getAge
		Assert.assertEquals(-1, a.compareTo(b));	// testing compareTo
		Assert.assertEquals("Bob, a 18-year old, seveirty 4.", b.toString());	// testing toString
		
		HealthyPerson c = new HealthyPerson("Lindsey", 24, "Visiting");	// testing HealthyPerson
		HealthyPerson d = new HealthyPerson("Gabe", 24, "Working");
		
		Assert.assertEquals("Lindsey", c.getName()); 
		Assert.assertEquals(24, c.getAge());	
		Assert.assertEquals(1, c.compareTo(d));	
		Assert.assertEquals("Lindsey, a 24-year old, in the hospital because of working.", c.toString());	
		
		
		Animal lion = new Animal("Lion", 5);
		
		
		
		
	}

}
