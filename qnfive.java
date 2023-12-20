import java.util.*;
public class qnfive {
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{
		int amount=s.nextInt();
		int last=0;
		if(amount<500)
		{ last=amount;
			System.out.println(last);
		}
		else if(amount>500 && amount<1000)
		{
			last=amount-amount*10/100;
			System.out.println(last);
		}
		else if(amount>1000)
		{
			last=amount-amount*20/100;
			System.out.println(last);
		}
	}
}
