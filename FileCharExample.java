import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesCharExample 
{
	public final int ENDOFFILE = -1;
	
	public  FilesCharExample() 
	{
		
		
				
		FileInputStream in = null;
		FileOutputStream out = null;
		
		System.out.println("reading file...");
		
		try 
		{
			in = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			System.out.println("can't find input file");
			return;
		}
		try {
			out = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		int c=0;
		do
		{
			try
			{
				c = in.read();
			
			System.out.print("*" + (char) c );
			out.write(c);
			}catch(IOException e)
			{
				System.out.println("error reading/writing file");
				return;
			}
		}while (c != ENDOFFILE);

		try {
			in.close();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finished");
		
	}
	
	public static void main(String[] args) 
	{
		FilesCharExampleExample o = new FilesCharExample();
	}

}
