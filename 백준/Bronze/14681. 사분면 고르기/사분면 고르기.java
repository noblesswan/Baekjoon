import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		
		if(firstNum > 0 && secondNum > 0)
		{
			System.out.println("1");
		}
		
		else if(firstNum > 0 && secondNum <0)
		{
			System.out.println("4");
		}
		else if(firstNum <0 && secondNum > 0)
		{
			System.out.println("2");
		}
		else if(firstNum < 0 && secondNum <0)
		{
			System.out.println("3");
		}	
	}
}
