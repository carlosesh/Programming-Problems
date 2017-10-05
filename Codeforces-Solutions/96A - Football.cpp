import java.util.Scanner;

public class 96A - Football 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String football;
		football = scan.nextLine();
		if(football.contains("1111111") || football.contains("0000000"))
			System.out.println("YES");
		
		else
			System.out.println("NO");
	}

}