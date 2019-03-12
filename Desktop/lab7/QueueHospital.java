import java.util.LinkedList;
import java.util.Queue;

/**
 * Class representing the order the patients will be treated, First in, First out
 *
 * @author Emily
 * @version 2019-03-09
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class QueueHospital <PersonType> extends Hospital<PersonType>{
	/**
	 * a queue that contains the patients
	 */
	private Queue<PersonType> queue;
	
	/**
	 * constructor that will create a queue with a default size of ten
	 */
	public QueueHospital() {
		queue = new LinkedList<>();
	}
	/**
	 * take the patient and adds it to the last of the list
	 */
	@Override
	public void addPatient(PersonType patient) {
		queue.add(patient);
	}
	/**
	 * Retrieves, but does not remove, the first element of this list, or returns null if this list is empty
	 * @return the first item in the LinkedList, also casting it to PersonType
	 */
	@Override
	public PersonType nextPatient() {
		
		return ((LinkedList<PersonType>) queue).peekFirst();
	}
	
	/**
	 * Retrieves and removes the head (first element) of this list.
	 * @return the first item of the list
	 */
	@Override
	public PersonType treatNextPatient() {
		
		return queue.remove();
	}
	
	/**
	 * Returns the number of components in this vector.
	 * @return the size(number of patients left to be treated) of the stack
	 */
	@Override
	public int numPatients() {
		
		return queue.size();
	}
	
	/**
	 * Returns the runtime class of this Object. The returned Class object is the object that is 
	 * locked by static synchronized methods of the represented class.
	 * @return The Class object that represents the runtime class of this object.
	 */
	@Override
	public String hospitalType() {
		
		return "" + queue.getClass();
	}
	
	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients
	 */
	@Override
	public String allPatientInfo() {
		
		return queue.toString();
	}

}
