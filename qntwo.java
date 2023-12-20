import java.util.*;
public class qntwo
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("please enter the number");
		int num=s.nextInt();
		if(num<0)
		{
			System.out.println("negative");
		}
		else
			System.out.println("positive");
	}

}
