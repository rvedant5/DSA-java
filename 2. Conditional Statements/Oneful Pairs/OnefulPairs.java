import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int num[]=new int[2];
		
		for (int i=0; i<2; i++)
		    num[i]=sc.nextInt();

    // A+B+(A*B) implementation
		int calc=num[0]+num[1]+(num[0]*num[1]);
		if(calc==111)
		    System.out.print("Yes");
		 else
		    System.out.print("No");
	}
}
