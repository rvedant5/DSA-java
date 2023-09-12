import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int brainSpeed[]=new int[2];
		
		for (int i=0;i<2 ;i++ )
		    brainSpeed[i]=sc.nextInt();
		 
		if(brainSpeed[1]>brainSpeed[0])
		    System.out.print("YES");
		else
		    System.out.print("No");
		
		
	}
}
