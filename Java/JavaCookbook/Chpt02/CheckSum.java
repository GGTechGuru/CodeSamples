/** 3.4 Processing a String One Character at a Time **/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckSum	{

	public static int process(String filePath)	{
		int sum =	0;
		try {

			BufferedReader is = new BufferedReader(new FileReader(filePath));

			String inputLine;
			while ((inputLine = is.readLine()) != null)	{
				int i;
				for (i=0; i<inputLine.length(); i++) {
					sum+=	inputLine.charAt(i);
				}
			}
			is.close();
		}
		catch(IOException e)	{
			System.out.println("IOException: " + e);
		}

		return sum;
	}


	public static void main(String[] argv)	{

		if (argv.length < 1)	{
			System.err.println("Supply at least one filename as 1st argument");

			throw new IllegalArgumentException("No file name supplied");
		}

		String filePath = argv[0];

		int checkSum = CheckSum.process(filePath);
		System.out.println("Checksum of file " + filePath + " is:" + checkSum);

	}
}
