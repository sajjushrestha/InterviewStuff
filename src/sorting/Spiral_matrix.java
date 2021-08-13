package sorting;

public class Spiral_matrix {

	static int R=3;
	static int C=6;
	public static void main(String[] args) {
		
		
		int a[][]= { {1 ,2 ,3 ,4 ,5 ,6},
					 {7 ,8 ,9,10,11,12},
					 {13,14,15,16,17,18}
					};
		
		print(a,0,0,R,C);

	}

	//using RECURSIVE
	 // Function for printing matrix in spiral 
    // form i, j: Start index of matrix, row  
    // and column respectively m, n: End index 
    // of matrix row and column respectively 
	
static void print(int arr[][], int i, int j, int r, int c) 
{ 
// If i or j lies outside the matrix 
if (i >= r || j >= c) 
{ 
  return; 
} 

// Print First Row 
for (int p = i; p < c; p++) 
{ 
  System.out.print(arr[i][p] + " "); 
} 

// Print Last Column 
for (int p = i + 1; p < r; p++)  
{ 
  System.out.print(arr[p][c - 1] + " "); 
} 

// Print Last Row, if Last and 
// First Row are not same 
if ((r - 1) != i)  
{ 
  for (int p = c - 2; p >= j; p--)  
  { 
      System.out.print(arr[r-1][p] + " "); 
  } 
} 

// Print First Column, if Last and 
// First Column are not same 
if ((c - 1) != j)  
{ 
  for (int p = r - 2; p > i; p--)  
  { 
      System.out.print(arr[p][j] + " "); 
  } 
} 
print(arr, i + 1, j + 1, r - 1, c - 1); 
}

}
