import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File
{

	public static void main(String[] args) throws IOException
	{
	 String filename="D:/demo_write.txt";
		FileWriter filewriter=new FileWriter(filename);
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		bufferedwriter.write("Hello, Yash Kohad");
		
		bufferedwriter.newLine();
		bufferedwriter.write("Hello, Yash Kohad");
		bufferedwriter.close();
	}

}
