package structure.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest
{
	public static void main(String[] args)
	{
		int c = 0;
		InputStream lowerInput = null;
		try
		{
			lowerInput = new LowerCaseInputStream(
					new BufferedInputStream(new FileInputStream("src/decorator/javaio/text.txt")));
			while ((c = lowerInput.read()) >= 0)
			{
				System.out.print((char) c);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (lowerInput != null)
			{
				try
				{
					lowerInput.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
}
