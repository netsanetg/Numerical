//approximate x^2 

import java.util.*;


public class integration_error 
{
	public static void f(int n, double start, double end)
	{
	
		//n is number of rectangles to approximate the integral of x^2
	double a[] = new double[n];

	double r = (end - start)/n;
	double sum = 0;
	for(int i = 0; i<n; i++)
	{
		a[i] = start + r * i;
		sum += Math.pow(a[i], 2) * r;
	}
	//System.out.println(Arrays.toString(a));
	
	System.out.println("Approximate is: " + sum);
	//Calculate and print error
	System.out.println("Error is: " + ((Math.pow(end, 3) - Math.pow(start, 3)) / 3 - sum));

	}


	public static void main(String[] args) 
	{

	int n;
	float start, end;
        Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the start, end and number of rectangles: ");
	start = s.nextFloat();
	end = s.nextFloat();
	n = s.nextInt();

	//Repeat until user presses Esc	
	//while(s.nextChar() != 27) 
		f(n,start,end);

        }//Main ends

}