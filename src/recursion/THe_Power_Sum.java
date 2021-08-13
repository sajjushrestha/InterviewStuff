package recursion;

public class THe_Power_Sum {

	public static void main(String[] args) {
		
		System.out.println(powerSum(100,2));
		
		
	}
	
	
	static int powerSum(int X, int N) {
	    
	    return calc(X,N,1);
	}
	static int calc(int X, int N, int num){
        int var = (int)Math.pow(num,N);
        if(var < X)
            return calc(X,N,num+1) + calc(X-var,N,num+1);
        if(var == X)
            return 1;
        else
            return 0;
    }
	
}
