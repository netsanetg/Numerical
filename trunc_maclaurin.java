//approximate e^x with given precision value

import java.util.*;


public class trunc_maclaurin 
{
	public static long fact(int n)
	{
		
	long f=1;
	for(int i = 2; i<=n; i++)
		f=f*i;
	return f;
	}


	public static void main(String[] args) 
	{

	float x, approx, p, y, v1=0;//x is the value of exponent in e^x, 
				//approx is the approximated value for the series, 
				//p is required precision
				//y intermediate error
	int n, i = 2, m;
        Scanner s = new Scanner(System.in);

	System.out.println("Enter the exponent value: ");
	x = s.nextFloat();
	
        System.out.print("Enter the amount of precision you want: ");
	        
	p = s.nextFloat();

	approx = 1;
	y = 1;
	int j = 1;
	
	System.out.println("n\t" + "e^1.2\t\t" + "Ea\t\t" + "Er(%)");
	while(y > p){
		v1 = approx;
		approx += Math.pow(x,j)/fact(j);
		y = (approx - v1)/approx;
		j++;
		
		System.out.println(j + "\t" + approx + "\t\t" + (approx - v1) + "\t\t" + y*100);
	}
	
	
	System.out.println("Approximate = " + approx + ", " + y + ", " + j); 
		 
        }//Main ends

}