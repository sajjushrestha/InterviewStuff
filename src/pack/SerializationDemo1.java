package pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo1 {

	public static void main(String[] args) throws Exception {
		
		Demo d=new Demo();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		/*
		 * oos.writeObject(d2); oos.writeObject(d3);
		 */
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Demo df=(Demo)ois.readObject();
		System.out.println();
		
		/*
		 * Object o=ois.readObject();
		 * 
		 * if(o instanceof Demo) { Demo dd=(Demo)o; System.out.println(dd.i
		 * +"-------"+dd.j); } else if(o instanceof Demo2) { Demo2 dd2=(Demo2)o;
		 * System.out.println(dd2.k +"-------"+dd2.l); } else { Demo3 dd3=(Demo3)o;
		 * System.out.println(dd3.a +"-------"+dd3.b); }
		 */
		
		
		
		
	}

}


class Demo implements Serializable
{
	  Demo2 dm=new Demo2();
}

class Demo2 implements Serializable
{
	Demo3 dm3=new Demo3();
}

class Demo3 implements Serializable
{
	int a=90;
	int b=100;
}
