import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int marks[]= new int[2];
		
		for (int i=0; i<2; i++)
		    marks[i]=sc.nextInt();
		    
		if(marks[0] >= marks[1]*2)
		    System.out.print("Yes");
		else
		    System.out.print("No");
	}
}
