package asad;

public class Myclass {

	public static void main(String[] args) {

		//courseData �al���yor mu diye denemek i�in
		CourseData math = new CourseData("101", "math101", 6);
		
		//sadece �oklu ders ekleme a��r� y�klemesini g�stermek i�in
		CourseData oop = new CourseData("151", "oop151", 8);
		CourseData makel = new CourseData("208", "makel208", 40);
		
		//array yapt�m ki y�kleyebileyim olu�turdu�um ��renciye
		CourseData[] lee = { oop, makel };

		//��renci olu�turdum
		Student myStudent01 = new Student("ali", "123456", 3);

		Student myStudent02 = new Student("veli", "654321", 2, lee);

		//��rencilere dersleri ekledim
		myStudent01.addCourse("147", "birders147", 6, "AA");
		myStudent01.addCourse("207", "kolayders207", 4, "AA");
		myStudent01.addCourse("187", "bi�ibi�i187", 7, "AA");
		
		myStudent02.addCourse("357", "benimdersim357", 5, "CC");
		myStudent02.addCourse("377", "bamba�kadersim377", 3, "CC");
		myStudent02.addCourse("397", "budaba�kabirders397", 6, "BB");

		//sistemin �al��t���n� test eden ve sonu�lar� ��kartan fonksiyonu �al��t�rd�m
		adamiVer(myStudent01);
	}

	//��rencinin var�n� yo�unu yapan k�s�m
	public static void adamiVer(Student myStu) {
		System.out.println(myStu.getName()+"  "+myStu.getNumber());
		
		//derslerin adlar�n� s�ralayan d�ng�
		for (int a = 0; a < myStu.courseCount(); a++) {
			if(myStu.getLesson(a)==null) {
				break;
			}
			System.out.println(" Ders Ad�: "+myStu.getLesson(a).getName());

		}
		
		System.out.println("GDP: " + myStu.getGDP());
	}

}
