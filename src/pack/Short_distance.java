package pack;

public class Short_distance {

	public static void main(String[] args) {
		
		char[] x= {'a','b','c','d','e','f','g','h','i','j'};
		int l=x.length;
		char[] x1 = {};
		int count=0,count1=0;
		int i;
		for(i=1;i<l-1;i++)
		{
			x1[count++]=x[i-1];
			
			System.out.println(x1[i]);
		}
		
		for(int j=i;j<l-1;j++)
		{
			x1[count1++]=x[j];
		}
		
		char input1='b';
		char input2='i';
		
		int temp = 0;
		int temp1 = 0;
		
		for(int is=0;is<l-1;is++)
		{
			if(x[is]==input1)
			{
				temp=is;
			}
			
			if(x[is]==input2)
			{
				temp1=is;
			}
		}
		
int tempdiff=temp1-temp;
int ldiff=l-temp1;

if(tempdiff<ldiff)
{
	for(int iii=temp+1;iii<ldiff;iii++)
	{
		System.out.println(x[iii]);
	}
}
else
{
	for(int ii=temp1;ii<l;ii++)
	{
		System.out.println(x[ii]);
	}
}

	}

}
