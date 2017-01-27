package collections_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionsPractice {

	public static void main(String a[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		try
		{
			input = br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(input);
	}
}
