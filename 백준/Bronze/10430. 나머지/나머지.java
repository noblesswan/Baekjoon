import java.util.Scanner;

class Calculator
{
	void firstCal(int A, int B, int C)
	{		
		System.out.println((A+B)%C); 
	}
	void secondCal(int A, int B, int C)
	{
		System.out.println(((A%C) + (B%C))%C);
	}
	void thirdCal(int A, int B, int C)
	{
		System.out.println((A*B)%C);
	}
	void fourthCal(int A, int B, int C)
	{
		System.out.println(((A%C) * (B%C))%C);
	}
}


public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		
		firstNum = scanner.nextInt();
		secondNum = scanner.nextInt();
		thirdNum = scanner.nextInt();
		
		calculator.firstCal(firstNum, secondNum, thirdNum);
		calculator.secondCal(firstNum, secondNum, thirdNum);
		calculator.thirdCal(firstNum, secondNum, thirdNum);
		calculator.fourthCal(firstNum, secondNum, thirdNum);
	}
}
