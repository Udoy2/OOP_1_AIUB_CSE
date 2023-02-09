package lab_task_2;
public class Employee1{
	private String name;
	private int age;
	private int salary;
	
	Employee1(String param_name, int param_age, int param_salary){
		name = param_name;
		age = param_age;
		salary = param_salary;
	}
	
	public void displayDetails(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary + "\n");
	}

	public int getSallary(){
		return salary;
	}
	
	public static void main(String[] args){
		Employee1[] emps  = new Employee1[10];
		for(int i =0 ; i < emps.length ; i++){
			emps[i] = new Employee1("udoy",21, (int) (Math.random() * 100000));
		}
		
		int emp_heighst_sallary = 0;
		for(int i =0 ; i < emps.length ; i++){
				if(emps[i].getSallary() > emp_heighst_sallary){
					emp_heighst_sallary = emps[i].getSallary();
				}
		}
		for(int i =0 ; i < emps.length ; i++){
				if(emps[i].getSallary() == emp_heighst_sallary){
					emps[i].displayDetails();
				}
		}
		System.out.println("Heighst Sallary: "+emp_heighst_sallary);
		
		
	}
}