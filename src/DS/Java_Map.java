package DS;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Java_Map {

	public static void main(String[] args) throws Exception, IOException {
		
		 Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      HashMap<String, Integer> hm = new HashMap<String, Integer>();
	     
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         hm.put(name, phone);         
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         try{
	            int temp = hm.get(s);
	            System.out.println(s+"="+temp);
	         }catch(NullPointerException e){
	            System.out.println("Not found");
	         }    
	      }
		
		
		
	}

}

/*

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		Map<String,String> map=new HashMap<String,String>();
		
		for(int i=1;i<=n;i++)
		{
			String name=br.readLine();
			String num=br.readLine();
			
			map.put(name, num);
			
		}
		
		System.out.println(map);
		
		String line=null;
		
		while((line=br.readLine()) != null)
		{
			String name=br.readLine();
			
			if(map.containsKey(name))
		{
				System.out.println(name+"="+map.get(name));
		}
			else
			{
				System.out.println("Not found");	
        }
		}

	

*/