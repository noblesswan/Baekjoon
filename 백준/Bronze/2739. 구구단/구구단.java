import java.util.Scanner;


class GuGudan
{
	int i;
	
	public GuGudan(int i) 
	{
		this.i=i;
	}
	void dan(int i)
	{
		for(int j = 1; j<10;j++) 
		{
			int result = i*j;
			System.out.println(i + " * " + j + " = " + result); 
		}
	}
}

public class Main {

    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
    	int numb = scanner.nextInt();
    	GuGudan gugudan = new GuGudan(numb);
    	gugudan.dan(numb);
    }
}
