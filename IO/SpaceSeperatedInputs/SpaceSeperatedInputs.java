import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		  int[] nums=new int[2];

      // for loop to get space seperated inputs
		  for (int i=0;i<2;i++)
		      nums[i]=sc.nextInt();
		
		  int serve=nums[0]*nums[1];
		  System.out.println(serve);
		
	}
}
