import java.util.Stack;
/**
 * Class representing the order the patients will be treated, Last in, First out
 *
 * @author Emily
 * @version 2019-03-09
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class StackHospital <PatientType> extends Hospital<PatientType>{
	/**
	 * a stack that will hold all the patients
	 */
	private Stack<PatientType> stack;
	
	/**
	 * constructor creating a stack with a default size of 10
	 */
	public StackHospital() {
		stack = new Stack<>(); 
	}
	
	/**
	 * Pushes an item onto the top of this stack.
	 */
	@Override
	public void addPatient(PatientType patient) {
		stack.push(patient);
		
	}
	
	/**
	 * Looks at the object at the top of this stack without removing it from the stack.
	 * @return the top first item in the stack
	 */
	@Override
	public PatientType nextPatient() {
		return stack.peek();
	}
	
	/**
	 * Removes the object at the top of this stack and returns that object as the value of this function.
	 * @return the top first item in the stack
	 */
	@Override
	public PatientType treatNextPatient() {
		return stack.pop();
	}
	
	/**
	 * Returns the number of components in this vector.
	 * @return the size(number of patients left to be treated) of the stack
	 */
	@Override
	public int numPatients() {
		return stack.size();
	}
	
	/**
	 * Returns the runtime class of this Object. The returned Class object is the object that is 
	 * locked by static synchronized methods of the represented class.
	 * @return The Class object that represents the runtime class of this object.
	 */
	@Override
	public String hospitalType() {
		return "StackHospital";
	}

	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients
	 */
	@Override
	public String allPatientInfo() {
	
			String patient = "";
			
			for (PatientType p : stack) {
				patient += p.toString();
			}
			return patient;
		}
}


