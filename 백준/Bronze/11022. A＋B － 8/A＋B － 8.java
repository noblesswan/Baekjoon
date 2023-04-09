import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(bufferedReader.readLine());
		
		for(int i = 1; i<count+1; i++)
		{
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int firstNum = Integer.parseInt(stringTokenizer.nextToken());
			int secondNum = Integer.parseInt(stringTokenizer.nextToken());
			
			bufferedWriter.write("Case #" + i + ": ");
			bufferedWriter.write(firstNum + " + " + secondNum + " = ");
			bufferedWriter.write((firstNum + secondNum) + "\n");
		}
		
		bufferedReader.close();
		bufferedWriter.flush();
		bufferedWriter.close();
	}	
}