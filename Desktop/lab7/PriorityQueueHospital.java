import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class representing the order the patients will be treated, unless the patients have a natural ordering
 * the patients should be treated via QueueHospital ordering
 *
 * @author Emily
 * @version 2019-03-09
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>{
	/**
	 * create a priority queue list to contain patients
	 */
	private Queue<PatientType> pq;
	
	/**
	 * constructor initialize the priority queue list
	 */
	public PriorityQueueHospital() {
		pq = new PriorityQueue<>();
	}
	/**
	 * Inserts the specified element into this priority queue.
	 */
	@Override
	public void addPatient(PatientType patient) {
		pq.add(patient);
		
	}
	
	/**
	 * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 * @return the first item of the list
	 */
	@Override
	public PatientType nextPatient() {
		
		return pq.peek();
	}

	/**
	 * Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 * @return the first item of the list 
	 */
	@Override
	public PatientType treatNextPatient() {
		
		return pq.poll();
	}
	
	/**
	 * Returns the number of components in this vector.
	 * @return the size(number of patients left to be treated) of the stack
	 */
	@Override
	public int numPatients() {
		
		return pq.size();
	}
	
	/**
	 * Returns the runtime class of this Object. The returned Class object is the object that is 
	 * locked by static synchronized methods of the represented class.
	 * @return The Class object that represents the runtime class of this object.
	 */
	@Override
	public String hospitalType() {
		
		return "" + pq.getClass();
	}
	
	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients
	 */
	@Override
	public String allPatientInfo() {
		
		return pq.toString();
	}
	

	

}