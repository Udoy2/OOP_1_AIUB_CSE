package lab_task_2;
public class Student1 {
	// private instance variables to store name, age, marks and average marks of a
	// student
	private String name;
	private int age;
	private int[] marks;
	float avarage_marks;

	// constructor to initialize the student's information
	Student1(String param_name, int param_age, int[] param_marks) {
		this.name = param_name;
		this.age = param_age;
		this.marks = param_marks;
		// call the method to calculate the average marks
		this.calculateAvarage();
	}

	// method to calculate the average marks of a student
	public void calculateAvarage() {
		float sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		this.avarage_marks = sum / marks.length;
	}

	// method to display the details of a student
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age : " + age);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("marks: " + marks[i]);
		}
	}

	public float getAvarageMark(){
		return avarage_marks;
	}

	public static void main(String[] args) {
		// create an array of 5 student objects
		Student1[] students = new Student1[5];
		for (int i = 0; i < 5; i++) {
			// generate random marks for each student
			int mark1 = (int) (Math.random() * 100);
			int mark2 = (int) (Math.random() * 100);
			int mark3 = (int) (Math.random() * 100);
			students[i] = new Student1("Udoy", 21, new int[] { mark1, mark2, mark3 });
		}

		// display the details of heighst avarage mark
		float heighst_avarage_mark = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getAvarageMark() > heighst_avarage_mark){
				heighst_avarage_mark = students[i].getAvarageMark();
			};
		}
		for (int i = 0; i < students.length; i++) {
			if(students[i].getAvarageMark() == heighst_avarage_mark){
				students[i].displayDetails();
			};
		}
		System.out.println("Heighest avarage marks:  "+heighst_avarage_mark);
	}
}
