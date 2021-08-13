package languageConcepts;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test extends Test_Parent{

	public static void method() {
		
		Test t=new Test();
		LocalDateTime now = LocalDateTime.now();
			   String time=dtf.format(now);
			  
			  System.out.println("main class time :"+time);
			
			  String path=".//Output//"+d+"//"+msv+"//"+time+"//";
			
			
			      boolean dirCreated = dir.mkdir();
			      File dir_msv=new File(".//Output//"+d+"//"+msv+"//");
			      boolean dir_msv_Created = dir_msv.mkdir();
			        
				  File dir_time = new File(path);
				  boolean dir_Created = dir_time.mkdir();
			  
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Test.method();
		
	  Thread.sleep(5000);
	  
	  Test.method();
		
	}
	
	private static void installEpsCliPlugin(String rpm) {
		System.out.println(rpm);
		
	}

	private static String masterCommand() {
		// TODO Auto-generated method stub
		return "vmy2842,vmy2843,vmy2844";
	}
	
	
	
	public void epscli()
	{}

}
