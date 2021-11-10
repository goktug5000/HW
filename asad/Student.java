package asad;

public class Student {
	
	//Derste istenen de�i�kenler
	String student_number;
	String studen_name;
	int enrollment_year = -1;
	CourseData[] myCourses = new CourseData[1000];
	//ka� adet ders ald���m� g�rmek i�in bir de�i�ken
	int courseCount = 0;

	//constructor k�sm�
	public Student(String SNum, String SName, int EYear) {
		student_number = SNum;
		studen_name = SName;
		enrollment_year = EYear;

	}

	//constructor k�sm� (di�er ve a��r� y�klemeli)
	public Student(String SNum, String SName, int EYear, CourseData[] MCourse) {
		student_number = SNum;
		studen_name = SName;
		enrollment_year = EYear;
		for (int q = 0; q < MCourse.length; q++) {
			myCourses[q] = MCourse[q];
		}
		courseCount = MCourse.length;
	}

	//getter setterlar
	public String getName() {
		return (studen_name);
	}

	public String getNumber() {
		return (student_number);
	}

	public int getEnrollmentYear() {
		return (enrollment_year);
	}
	public int courseCount() {
		return (myCourses.length);
	}

	public CourseData getLesson(int i) {
		return (myCourses[i]);
	}

	public boolean checkCourse() {
		return (false);
	}

	public void setCourseGrade() {
		
	}
	
	//ders eklemek i�in kulland���m metod
	public void addCourse(String myCode, String myName, int myCredit, String myGrade) {
		CourseData ders = new CourseData(myCode, myName, myCredit);
		ders.setGrade(myGrade);
		myCourses[courseCount] = ders;
		courseCount++;
	}

	//GDP hesaplamas� i�in kulland���m yol
	public double getGDP() {
		
		float totalCredit = 0;
		float GDP_cal=0;
		
		for (int a = 0; a < 1000; a++) {
			if (getLesson(a) == null) {
				break;
			}
			
			totalCredit += getLesson(a).getCredit();
			
			
			if(getLesson(a).getGrade()=="AA") {
				GDP_cal += 4 * getLesson(a).getCredit();
			}
			if(getLesson(a).getGrade()=="BB") {
				GDP_cal += 3 * getLesson(a).getCredit();
			}
			if(getLesson(a).getGrade()=="CC") {
				GDP_cal += 2 * getLesson(a).getCredit();
			}
			if(getLesson(a).getGrade()=="DD") {
				GDP_cal += 1 * getLesson(a).getCredit();
			}
			if(getLesson(a).getGrade()=="FF") {
				GDP_cal += 0 * getLesson(a).getCredit();
			}
		}

		System.out.println("totalCredit: " + totalCredit);
		System.out.println("GDP_cal: " + GDP_cal);
		
		double sonuc=GDP_cal/totalCredit;
		return (sonuc);
	}

}
