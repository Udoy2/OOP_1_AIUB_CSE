package lab_task_2;
public class Employee{
	private String name;
	private int age;
	private int salary;
	
	Employee(String param_name, int param_age, int param_salary){
		name = param_name;
		age = param_age;
		salary = param_salary;
		System.out.println("Constructor");
	}
	
	public void displayDetails(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public static void main(String[] args){
		Employee emp  = new Employee("udoy",21,1000000);

		emp.displayDetails();
		
	}
}