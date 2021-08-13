package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Create_Directory_and_file_in_directory {

	public static void main(String[] args) throws IOException {
		
		File f=new File("Temp_Directory");
		f.mkdir();
		File g=new File("Temp_Directory","Demo.txt");
		g.createNewFile();
		
		if(g.exists())
		{
			FileWriter fw=new FileWriter(".//Temp_Directory//Demo.txt",true);
			fw.write("Sajju2");
			fw.write(100);  //filewriter will write the ansci value of 100 in the file which is not recomended.
			fw.flush();
			fw.close();
		}
		
		
	}

}
