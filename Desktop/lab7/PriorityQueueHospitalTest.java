import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest {

	@Test
	public void addTest() {
		PriorityQueueHospital<SickPerson> a = new PriorityQueueHospital<>();
		SickPerson Sp1 = new SickPerson("Stinky", 10, 1);
		SickPerson Sp2 = new SickPerson("Harry", 19, 5);
		
		a.addPatient(Sp1);
		Assert.assertEquals(1, a.numPatients());	// using the list's size to test the add 
		
		a.addPatient(Sp2);
		Assert.assertEquals(2, a.numPatients());
		
	}
	
	@Test
	public void nextPatientTest() {
		PriorityQueueHospital<SickPerson> a = new PriorityQueueHospital<>();
		SickPerson Sp1 = new SickPerson("Stinky", 10, 1);
		SickPerson Sp2 = new SickPerson("Harry", 19, 5);
		SickPerson Sp3 = new SickPerson("Emma", 58, 9);
		
		a.addPatient(Sp1);
		a.addPatient(Sp2);
		a.addPatient(Sp3);
		
		Assert.assertEquals(Sp1, a.nextPatient());		// test the next Patient
		Assert.assertEquals(Sp1, a.nextPatient());	 	// the next patient will always be the same unless treated
		
	}
	
	@Test
	public void treatNextPatientTest() {
		PriorityQueueHospital<SickPerson> a = new PriorityQueueHospital<>();
		SickPerson Sp1 = new SickPerson("Stinky", 10, 1);
		SickPerson Sp2 = new SickPerson("Harry", 19, 5);
		SickPerson Sp3 = new SickPerson("Emma", 58, 9);
		
		a.addPatient(Sp1);
		a.addPatient(Sp2);
		a.addPatient(Sp3);
		
		Assert.assertEquals(Sp1, a.treatNextPatient());		// test treatNextPatient, which returns and removes the next patient
		Assert.assertEquals(Sp3, a.treatNextPatient());
		Assert.assertEquals(Sp2, a.treatNextPatient());
		
	}
	
	@Test
	public void numPatientTest() {
		PriorityQueueHospital<SickPerson> a = new PriorityQueueHospital<>();
		SickPerson Sp1 = new SickPerson("Stinky", 10, 1);
		SickPerson Sp2 = new SickPerson("Harry", 19, 5);
		SickPerson Sp3 = new SickPerson("Emma", 58, 9);
		
		a.addPatient(Sp1);
		
		Assert.assertEquals(1, a.numPatients());	// testing number of patients in the list
		
		a.addPatient(Sp2);
		a.addPatient(Sp3);
		
		Assert.assertEquals(3, a.numPatients());
	}
	
	@Test
	public void hospitalTypeTest() {
		PriorityQueueHospital<SickPerson> a = new PriorityQueueHospital<>();
		
		Assert.assertEquals("PriorityQueueHospital", a.hospitalType());		// testing the type of the hospital
		
		
	}
	
	@Test
	public void patientInfoTest() {
		PriorityQueueHospital<SickPerson> a = new PriorityQueueHospital<>();
		SickPerson Sp1 = new SickPerson("Stinky", 10, 1);

		a.addPatient(Sp1);
		
		Assert.assertEquals("Stinky, a 10-year old. Severity level 1", a.allPatientInfo());		// test the patient's infos
	
		
	}
}

