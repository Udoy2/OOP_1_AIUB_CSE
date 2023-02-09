package lab_task_2;
public class Student{
		private String name;
		private int age;
		private int[] marks;
		float avarage_marks;
		Student(String param_name, int param_age , int[] param_marks){
			this.name = param_name;
			this.age = param_age;
			this.marks = param_marks;
			System.out.println("Student constructor !!");
            this.calculateAvarage();
		}
		
		public void calculateAvarage(){
			float sum = 0;
			for(int i=0 ; i < marks.length; i++){
				sum += marks[i];
			}
			this.avarage_marks = sum / marks.length;
			System.out.println("avarage marks saved");
		}
		
		public void displayDetails(){
			System.out.println("Name: " + name);
			System.out.println("Age : " + age);
			for(int i = 0 ; i < marks.length; i++ ){
				System.out.println("marks: "+ marks[i] );	
			}
            System.out.println("Avarage Marks: " + this.avarage_marks);
			
		}
		
		public static void main(String[] args) {
            Student student = new Student("udoy",17,new int[]{34,67,65});
            student.displayDetails();
		}
}

