
import java.util.*;
public class qnfour {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter three numbers");
		int one=s.nextInt();
		int two=s.nextInt();
		int three=s.nextInt();
		if(one>two && one>three)
		{
			System.out.println(one);
		}
		else if(two>one && two>three)
		{
			System.out.println(two);
		}
		else
			System.out.println(three);
		
	}

}
