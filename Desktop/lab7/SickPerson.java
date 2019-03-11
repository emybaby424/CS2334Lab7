
public class SickPerson extends Person{
	
	/**
	 * Stores the reason of why the person is in hospital
	 */
	private String reason;
	
	/**
	 * Passes the name and age to the super class and stores the reason of the person
	 *
	 * @param name The Person's name.
	 * @param age The Person's age, in years.
	 * @param reason The Person's reason to be in the hospital
	 */
	public SickPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
		
	}

	/**
	 * Implementation method for Person's compareTo method(). 
	 * 
	 * @param p - The Person used to compare self with.
	 * @return standard comparison result:
	 * 	(1) self's name comes "before" o's name: negative number 
	 * 	(2) self's name comes "after" p's name: positive number 
	 * 	(3) names are equivalent: 0 i.e. the natural ordering of the name strings, ignoring case - orders alphabetically.
	 */
	@Override
	protected int compareToImpl(Person p) {
		
		return 0;
		
	}

}
