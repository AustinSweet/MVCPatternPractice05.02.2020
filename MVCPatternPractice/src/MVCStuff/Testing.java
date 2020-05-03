package MVCStuff;

public class Testing {

	public static void main(String[] args) {
		
		StudentRecord testRecord = new StudentRecord();
		
		Student testStudent1 = new Student("1", "Joe", "01/01/1990");
		Student testStudent2 = new Student("2", "Jill", "02/02/1992");

		RecordController testControl = new RecordController(testRecord);		
		ScreenDisplay testDisplay = new ScreenDisplay(testControl, testRecord);
		
		testRecord.addObserver(testDisplay);
		
		testRecord.addStudent(testStudent1);
		testRecord.addStudent(testStudent2);
				
		testStudent1.setName("Jack");
		
		testControl.changeStudentRecord(testStudent1);
		
	}

}
