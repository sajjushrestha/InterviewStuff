package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Buffered_Reader {

	//##############The most enhanced Reader to read character data from the File is BufferedReader.//#########################
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("Demo.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
			
		}
		br.close(); 

	}

}
