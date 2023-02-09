package lab_task_2;
public class Circle{
	private float radius;
	Circle(int param_rad){
		radius = param_rad;
	}
	public void calculateArea(){
		System.out.println(3.1415*radius*radius);
		System.out.println(2*3.1415*radius);
	}
	public static void main(String[] args){
		Circle[] circles = new Circle[5];
		
		for(int i =0 ; i < circles.length ; i++){
			circles[i] = new Circle(5);
		}
		for(int i =0 ; i < circles.length ; i++){
			circles[i].calculateArea();
		}
	}
}