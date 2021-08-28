package Day4;

public class NumPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=8;i++) {
			for(int j=8;j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}