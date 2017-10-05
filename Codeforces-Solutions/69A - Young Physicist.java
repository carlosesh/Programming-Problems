import java.util.Scanner;

public class 69A - Young Physicist 
{
	public static void main(String[] args) 
	{
		int n=0, x=0, y=0, z=0, temp=0;
		Scanner sc = new Scanner(System.in);
		
		n= sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			temp = sc.nextInt();
			x+=temp;
			temp = sc.nextInt();
			y+=temp;
			temp = sc.nextInt();
			z+=temp;
		}
		if (x==0 && y==0 && z==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}