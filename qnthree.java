import java.util.Scanner;
public class qnthree {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number");
		int num=s.nextInt();
		int rev=numberreversal(num);
		System.out.println(rev);

	}
	public static int numberreversal(int num)
	{
		int reversednum=0;
		while(num>0)
		{
			int digit=num%10;
			reversednum=reversednum*10+digit;
			num/=10;
		}
		return reversednum;
	}

}
