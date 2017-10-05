import java.util.Scanner;

public class 339A - Helpful Maths 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str;
		str=scan.nextLine();
		String myStr = str.replaceAll("\\+", "");
		char[] array = myStr.toCharArray();
		char swap;
		
		for(int i = 0; i<array.length; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j]>array[j+1])
				{
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		System.out.print(array[0]);
		for(int i=1; i<=array.length-1; i++){
			System.out.print("+" + array[i]);
		}
	}
}