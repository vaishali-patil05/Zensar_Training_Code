package Day3;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0,avg=0;
     for(int i=2;i<10;i=i+2)
     {
    	 sum=sum+i;
    	 System.out.println("sum is :" +sum);
     }
     
     avg=sum/10;
     
     System.out.println("Avg is :" +avg);
	}

}
