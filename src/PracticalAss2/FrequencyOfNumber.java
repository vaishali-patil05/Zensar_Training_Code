package PracticalAss2;
import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        int number,i,count,digit,temp;
        System.out.println("Enter any Number : ");
        number=sc.nextInt();
         System.out.println("Digit\tFrequency");
        for(i=0;i<=9;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }

	}

}
