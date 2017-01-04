package decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest
{
	public static void main(String[] args) throws IOException
	{
		int c;
		InputStream lowerInput = new LowerCaseInputStream(
				new BufferedInputStream(new FileInputStream("src/decorator/javaio/text.txt")));

		while ((c = lowerInput.read()) >= 0)
		{
			System.out.print((char)c);
		}

	}
}
