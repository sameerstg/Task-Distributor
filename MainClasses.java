package PackagePrimitive;

import java.io.Console;
import java.util.Random;

public class OOPClass2 {

	public static void main(String[] args) {
		 int min = 5,max = 10;
		
	Random ran = new Random();
	for(int i =0;i<11;i++){
		System.out.println(((Math.random() * (max - min)) + min));
	}
	
	}

}
class Employee{
	 String name;
	 
}

class Work{
	
}
class Task{
	
	
	public String getWorkTitle() {
		return workTitle;
	}
	public Task(String workTitle, String workDescription) {
		super();
		this.workTitle = workTitle;
		this.workDescription = workDescription;
		
	}
	public void setWorkTitle(String workTitle) {
		this.workTitle = workTitle;
	}
	public String getWorkDescription() {
		return workDescription;
	}
	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}
	public float getGettingWorkHours() {
		return gettingWorkHours;
	}
	public void setGettingWorkHours(float gettingWorkHours) {
		this.gettingWorkHours = gettingWorkHours;
	}
	public float getConsumedWorkHours() {
		return consumedWorkHours;
	}
	public void setConsumedWorkHours(float consumedWorkHours) {
		this.consumedWorkHours = consumedWorkHours;
	}
	
	String workTitle;
	String workDescription;
	float gettingWorkHours;
	float consumedWorkHours;
	
	
	
}

