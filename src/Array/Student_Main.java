package Array;
import java.util.Scanner;

public class Student_Main {
	public static void main(String[] args) {
		Student[] arr=new Student[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,percent  :");
		int id=sc.nextInt();
		String nm=sc.next();
		float per=sc.nextFloat();
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Student(id,nm,per);
		}
		System.out.println(id);
		System.out.println(nm);
		System.out.println(per);
		
		
		
	}

}
