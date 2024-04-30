import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FilesExample 
{
	public final int ENDOFFILE = -1;
	
	public  FilesExample() throws IOException
	{
		
		
		File file = new File("input.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		StringBuffer buffer = new StringBuffer();
		String line;
		while((line = br.readLine())!=null)
		{
			buffer.append(line);
			buffer.append("\n");
			System.out.println("***"+line+"***");
		}
		System.out.println("The whole thing:"+buffer);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		FilesExample o = new FilesExample();
	}

}
