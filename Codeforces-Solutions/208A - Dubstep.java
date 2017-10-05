import java.util.Scanner;

public class 208A - Dubstep 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		String finalstr = str.replace("WUB", " ");
		
		System.out.println(finalstr.trim());
	}

}