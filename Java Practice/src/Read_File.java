import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File
{

	public static void main(String[] args) throws IOException 
	{
	  String filename="D:/demo_write.txt";
	  String line="";
	  FileReader filereader=new FileReader(filename);
	  BufferedReader bufferedreader=new BufferedReader(filereader);
	  
	  while((line=bufferedreader.readLine())!=null)
	  {
		  System.out.println(line);
	  }
	  bufferedreader.close();
	
	}

}
