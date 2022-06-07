package interview;

import java.util.ArrayList;
import java.util.List;

public class Coupa1_Array {

	public static void main(String[] args) {

int a[]= {10,20,15};
int n=5,k=0,count=0;


List<Integer> list=new ArrayList<Integer>();
while(k<n)
{
	for(int i=0;i<a.length;i++)
	{
	list.add(a[i]);
	}
	
	k++;
}


System.out.println(list);

for(int i=0;i<list.size();i++)
{
	for(int j=i+1;j<list.size()-1;j++)
	{
		if(list.get(i)>list.get(j))
			{
				count++;
			}
}
}

System.out.println(count);
	}

	

}
