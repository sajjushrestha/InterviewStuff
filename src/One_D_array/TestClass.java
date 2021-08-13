package One_D_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestClass implements Cloneable{

	public static void  main(String[] args) throws CloneNotSupportedException, Exception {
		
		System.out.println(findDay(9,25,2019));
		/*Date now = new Date("25/12/2019");
	 
    SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
    System.out.println(simpleDateformat.format(now));

    simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
    System.out.println(simpleDateformat.format(now));

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); 
    }*/
			
		/*
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String input_date=br.readLine();
		 * 
		 * 
		 * 
		 * String[] split=input_date.split("\\s+");
		 * 
		 * 
		 * 
		 * String date=split[0]+"/"+split[1]+"/"+split[2];
		 * 
		 * 
		 * SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy"); Date
		 * dt1=format1.parse(date); DateFormat format2=new SimpleDateFormat("EEEE");
		 * String finalDay=format2.format(dt1);
		 * System.out.println(finalDay.toUpperCase());
		 */
	}
	
	 public static String findDay(int month, int day, int year) throws ParseException  {



		  String date=String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
		          SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		          Date dt1=format1.parse(date);
		          DateFormat format2=new SimpleDateFormat("EEEE"); 
		          String finalDay=format2.format(dt1);
		          return finalDay.toUpperCase();
		    }

		}

		 

		
		/*
		 * String a=new String("test"); String b=new String("test"); String c="test";
		 * String d=a; System.out.println(b==d);System.out.println(a.equals(c));
		 * System.out.println(a.hashCode());System.out.println(b.hashCode());System.out.
		 * println(d.hashCode());
		 * 
		 * TestClass t=new TestClass(); TestClass t2=(TestClass)t.clone(); TestClass
		 * t3=t;
		 * 
		 * System.out.println(t.hashCode()); System.out.println(t2.hashCode());
		 * System.out.println(t3.hashCode());
		 */
		
	

	/*
	 * 
	 * @Override public void abstractMethod() {
	 * System.out.println("this is from abstractMethod..."); }
	 * 
	 * 
	 * public static void main(String... args) {
	 * 
	 * try { String s=null; s.length(); }
	 * 
	 * 
	 * catch(NullPointerException e2) {System.out.println(e2);} catch(Exception e1)
	 * {System.out.println(e1);} catch(Throwable e) {System.out.println(e);}
	 * 
	 * 
	 * TestInterface emp = new TestClass();
	 * 
	 * TestInterface emp = new TestInterface() {//Anonymous InnerStyle
	 * 
	 * 
	 * @Override public void abstractMethod() {
	 * System.out.println("this is from abastrat , and Anonymous Inner Style ...");
	 * 
	 * }
	 * 
	 * };
	 * 
	 * 
	 * 
	 * 
	 * 
	 * emp.abstractMethod(); emp.defaultMethod(); TestInterface.staticMethod();
	 * 
	 * TestInterface emp = new TestClass(); emp.abstractMethod();
	 * emp.defaultMethod(); TestInterface.staticMethod();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

