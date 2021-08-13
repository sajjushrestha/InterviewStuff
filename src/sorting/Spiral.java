package sorting;

class Spiral {
    public static void main(String argg[]) {
                   //int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
                   //int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
                   //int arr[][]={{1,2,3},      {10,11,4},{9,12,5},{8,7,6}};
                   int arr[][]={{1,2,3,4,5},
                		   	   {6,7,8,9,10},
                		      {11,12,13,14,15},
                		     {16,17,18,19,20},
                		     {21,22,23,24,25}};
                   int rl=0,cl=0;
                   int i=0,j=0;


                   int ru=arr.length - 1;
                   int cu=arr[0].length -1 ;

                   boolean rowTraverse=true;
                   boolean inverse=false;
                   
                   while(rl<=ru && cl <=cu ) 
                   {
                                 //System.out.println("\nrowTraverse:"+rowTraverse+", inverse:"+inverse+",i:"+i+",j"+j);                             
                                 System.out.print(arr[i][j]+" ");

                                 if(rowTraverse){
                                                if(inverse) {
                                                              --j;
                                                              if(j==cl){
                                                                            rowTraverse=false;
                                                                            --ru;
                                                              }
                                                }
                                                else {
                                                              ++j;
                                                              if(j==cu){
                                                                            rowTraverse=false;
                                                                            ++rl;
                                                              }
                                                }
                                                
                                 }else{
                                                if(inverse) {
                                                              --i;
                                                              if(i==rl){
                                                                            rowTraverse=true;
                                                                            inverse=false;
                                                                            ++cl;
                                                              }
                                                }
                                                else {                                  
                                                              ++i;
                                                              if(i==ru){
                                                                            rowTraverse=true;
                                                                            inverse=true;
                                                                            --cu;
                                                              }
                                                }
                                 }

                   }
                  // System.out.println("arr["+i+"]["+j+"] >> "+arr[i][j]);
                   System.out.print(arr[i][j]+" ");
    }
}
