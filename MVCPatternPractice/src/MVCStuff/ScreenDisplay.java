package MVCStuff;

import java.util.Observable;
import java.util.Observer;

public class ScreenDisplay implements Observer{
	private Student displayStudent;
	private StudentRecord displayRecord;
	private RecordController studentRecordController;

	public ScreenDisplay(RecordController studentRecordController, StudentRecord displayRecord) {
		this.displayRecord = displayRecord;
		this.studentRecordController = studentRecordController;
	}
	
	public Student getDisplayStudent() {
		return displayStudent;
	}

	public void setDisplayStudent(Student displayStudent) {
		this.displayStudent = displayStudent;
	}

	public void displayStudent(String id) {
		this.displayStudent = this.displayRecord.getStudent(id);
		System.out.println(this.displayStudent);
	}
	
	public void changeStudentName(String newName) {
		if (this.displayRecord != null) {
			this.displayStudent.setName(newName);
		}
		else {
			System.out.println("Please enter valid Student ID before requesting.");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Updated\n" + arg);
	}
	
	
}
