package asad;

public class CourseData {
	String code;
	String name;
	String grade;
	int credit;

	//constructor k�sm�
	public CourseData(String myCode, String myName, int myCredit) {
		code = myCode;
		name = myName;
		credit = myCredit;
	}

	//get set k�sm�
	public String getName() {
		return (name);
	}

	public String getGrade() {
		return (grade);
	}

	public int getCredit() {
		return (credit);
	}

	public void setGrade(String myGrade) {
		grade = myGrade;
	}

}
