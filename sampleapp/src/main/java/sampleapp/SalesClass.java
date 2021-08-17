package sampleapp;

public class SalesClass {
	public void display() {
		int[] arr = {23,45,65,67,6};
		int sum=0;
		for(int num:arr) {
			sum+=num;
			System.out.println(num);
		}
		
		System.out.println("Sumation:" + sum);
			
	}
	
	public void print() {
		System.out.println("Print All array members");
		display();
	}

}
