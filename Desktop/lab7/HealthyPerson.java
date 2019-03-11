
public class HealthyPerson extends Person{

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
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;

}

	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}
