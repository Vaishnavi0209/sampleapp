package sampleapp;

public class SalesClass {
	public void display() {
		int[] arr = {23,45,65,67,6};
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("array Size" + arr.length);
		System.out.println("Sumation:" + sum);
			
	}
	
	public void print() {
		System.out.println("Print All array members");
		display();
	}

}
