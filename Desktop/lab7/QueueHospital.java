/**
 * Class representing the order the patients will be treated, First in, First out
 *
 * @author Emily
 * @version 2019-03-09
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class QueueHospital <PersonType> extends Hospital<PersonType>{

	@Override
	public void addPatient(PersonType patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonType nextPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonType treatNextPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String allPatientInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
