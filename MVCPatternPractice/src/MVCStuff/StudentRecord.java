package MVCStuff;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class StudentRecord extends Observable{
	Map<String, Student> studentList;
	
	public StudentRecord() {
		this.studentList = new HashMap<String, Student>();
	}
	
	public StudentRecord(Map<String, Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(Student s) {
		this.studentList.put(s.getId(), s);
		setChanged();
		notifyObservers(s);
	}
	
	public Student getStudent(String id) {
		return this.studentList.get(id);
	}
	
	
	
	//TODO implement notifyObserver and setChanged
}
