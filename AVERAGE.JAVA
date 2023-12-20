import java.util.Scanner;
public class Average
{
public static void main(String args[])
{
	int n,d,r=0,i;
	Scanner input=new Scanner(System.in);
	Scanner.out.println("Enter n ");
	n=input.nextInt();
	System.out.println("Enter element ");
	while(n>0)
	{	
		d=n%10;
		r=r*10+d;
		n=n/10;
		}
		System.out.println("Reverse is "+ r);
		}
		}