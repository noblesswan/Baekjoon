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
		
		for(int i=0;i<count;i++)
		{
			for(int j=count; j>i+1; j--)
			{
				bufferedWriter.write(' ');
			}
			for(int h=0; h<i+1; h++)
			{
				bufferedWriter.write('*');
			}
			bufferedWriter.write('\n');
		}
		bufferedWriter.flush();
	}	
}
