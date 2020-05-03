package MVCStuff;

public class RecordController {
	private StudentRecord controllerRecord;
	
	public RecordController (StudentRecord controllerRecord) {
		this.controllerRecord = controllerRecord;
	}
	
	public void changeStudentRecord(Student s) {
		this.controllerRecord.addStudent(s);
	}
	
}
