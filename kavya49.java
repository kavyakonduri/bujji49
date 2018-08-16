/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[] {45,37,23,1,5,39,60,70,50};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
          if(a[i]>max)
          {
          max=a[i];
           }
          if(a[i]<min)
          {
             min =a[i];
          }
        }
       System.out.println("largest number is"+max);
       System.out.println("smallest numer is "+min);             
	}
}
