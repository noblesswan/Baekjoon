import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int totalPrice = scanner.nextInt();
		int count = scanner.nextInt();
		int sum = 0;
		
		for(int i=0; i<count; i++)
		{
			int price = scanner.nextInt();
			int productNum = scanner.nextInt();
			sum += price * productNum;
		}
		
		if(totalPrice == sum)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}

