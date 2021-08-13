package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_best_writer {

	public static void main(String[] args) throws Exception {
	
		FileWriter fw=new FileWriter("Demo.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);
		pw.flush();
		pw.close();

	}

}
