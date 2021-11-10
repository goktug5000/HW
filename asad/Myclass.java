package asad;

public class Myclass {

	public static void main(String[] args) {

		//courseData çalýþýyor mu diye denemek için
		CourseData math = new CourseData("101", "math101", 6);
		
		//sadece çoklu ders ekleme aþýrý yüklemesini göstermek için
		CourseData oop = new CourseData("151", "oop151", 8);
		CourseData makel = new CourseData("208", "makel208", 40);
		
		//array yaptým ki yükleyebileyim oluþturduðum öðrenciye
		CourseData[] lee = { oop, makel };

		//öðrenci oluþturdum
		Student myStudent01 = new Student("ali", "123456", 3);

		Student myStudent02 = new Student("veli", "654321", 2, lee);

		//öðrencilere dersleri ekledim
		myStudent01.addCourse("147", "birders147", 6, "AA");
		myStudent01.addCourse("207", "kolayders207", 4, "AA");
		myStudent01.addCourse("187", "biþibiþi187", 7, "AA");
		
		myStudent02.addCourse("357", "benimdersim357", 5, "CC");
		myStudent02.addCourse("377", "bambaþkadersim377", 3, "CC");
		myStudent02.addCourse("397", "budabaþkabirders397", 6, "BB");

		//sistemin çalýþtýðýný test eden ve sonuçlarý çýkartan fonksiyonu çalýþtýrdým
		adamiVer(myStudent01);
	}

	//öðrencinin varýný yoðunu yapan kýsým
	public static void adamiVer(Student myStu) {
		System.out.println(myStu.getName()+"  "+myStu.getNumber());
		
		//derslerin adlarýný sýralayan döngü
		for (int a = 0; a < myStu.courseCount(); a++) {
			if(myStu.getLesson(a)==null) {
				break;
			}
			System.out.println(" Ders Adý: "+myStu.getLesson(a).getName());

		}
		
		System.out.println("GDP: " + myStu.getGDP());
	}

}
