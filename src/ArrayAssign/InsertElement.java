package ArrayAssign;

public class InsertElement {
 static void m1(int[] arr) {
	 arr[0]=50;
 }
public static void main(String[] args) {
	int[] arr= {1,2,3,7,8};
	m1(arr);
	
	for(int d:arr)
		System.out.println(d);
}
	
}
