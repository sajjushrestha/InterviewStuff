package DS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Java_List {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); 
		
		String line=br.readLine();
		
		String[] split=line.split("\\s");
		
		
		
		List<String> l=new ArrayList<String>();
		
		for(int i=0;i<a;i++)
		{
			l.add(split[i]);
		}
		
		int q=Integer.parseInt(br.readLine()); 
	
		
		for(int i=1;i<=q;i++)
		{
		 String action=br.readLine();
		
		 String action_values=br.readLine();
		
		 
		 
		 if(action.equals("Insert"))
		 {
		 String[] split_action=action_values.split(" ");
		 Integer j=Integer.parseInt(split_action[0]);
			
			l.add(j,split_action[1]); 
		 }
		 
		 if(action.equals("Delete"))
		 {
		  Integer k=Integer.parseInt(action_values);
			l.remove(l.get(k));
		 }
		 
		 
		}
		for(int i=0;i<l.size();i++)
		System.out.print(l.get(i) +" ");
	}

}
