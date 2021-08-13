package languageConcepts;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test_Parent {
	
	
	 static String pattern = "ddMMyyyy";
		static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	    static String d = simpleDateFormat.format(new Date());
		static File dir = new File(".//Output//"+d);
		protected static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		protected  LocalDateTime now = LocalDateTime.now();
		protected  String time=dtf.format(now);
		 
		static String msv="vmy1741.ete.ka.sw.ericsson.se";// JOptionPane.showInputDialog("Enter MSV node").trim()+".ete.ka.sw.ericsson.se";
		protected  String path=".//Output//"+d+"//"+msv+"//"+time+"//";
		
		
		      boolean dirCreated = dir.mkdir();
		      File dir_msv=new File(".//Output//"+d+"//"+msv+"//");
		      boolean dir_msv_Created = dir_msv.mkdir();
		        
			  File dir_time = new File(path);
			  boolean dir_Created = dir_time.mkdir();
			  
			  Test_Parent()
			  {
				  System.out.println("parent class time :" +time);
			  }
		  

}
