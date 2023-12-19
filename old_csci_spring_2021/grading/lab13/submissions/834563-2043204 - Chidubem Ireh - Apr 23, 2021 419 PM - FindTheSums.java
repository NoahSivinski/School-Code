/**Class FindTheSums**/
public class FindTheSums {
/**function to return string for 2D array**/
   public static String arrayToString(int[][] a) {
       String res = "";
       for(int i = 0 ; i < a.length; i++){
           for(int j = 0 ; j < a[i].length; j++){
               if(j == a[i].length-1)
                   res+=a[i][j];
               else
                   res+=a[i][j]+" ";
           }
           if(i!=a.length-1)
           res+="\n";
       }
return res;
   }
   /**horizontalSums function**/
   public static int[][] horizontalSums(int[][] a,int sumToFind){
       int[][] b = new int[a.length][a[0].length];/**creating new array b with same dimensions as a**/
       for(int i = 0 ; i < a.length; i++)
           for(int j = 0 ; j < a[i].length; j++)
               b[i][j]=0;/**initializing all elements to be 0 in array b**/
       for(int i = 0 ; i < a.length; i++){
           for(int j = 0 ; j < a[i].length; j++){
               int sum=0,k=j;/**finding every possible sum in each row starting from every element**/
               while(k<a[i].length){
                   sum+=a[i][k];
                   if(sum>sumToFind)break;/**if sum becomes greater the break**/
                   if(sum==sumToFind){
                       for(int t=j;t<=k;t++)/**if the requires sum is reached populate corresponding values in b**/
                           b[i][t]=a[i][t];
                       break;
                   }
               k++;
               }
           }
       }
       return b;/**return b**/
   }
   /**verticalSums function**/
   public static int[][] verticalSums(int[][] a,int sumToFind){
       int[][] b = new int[a.length][a[0].length];/**creating new array b with same dimensions as a**/
       for(int i = 0 ; i < a.length; i++)
           for(int j = 0 ; j < a[i].length; j++)
               b[i][j]=0;/**initializing all elements to be 0 in array b**/
       for(int i = 0 ; i < a[0].length; i++){
           for(int j = 0 ; j < a.length; j++){
               int sum=0,k=j;/**finding every possible sum in each column starting from every element**/
               while(k<a.length){
                   sum+=a[k][i];
                   if(sum>sumToFind)break;/**if sum becomes greater the break**/
                   if(sum==sumToFind){
                       for(int t=j;t<=k;t++)/**if the requires sum is reached populate corresponding values in b**/
                           b[t][i]=a[t][i];
                       break;
                   }
               k++;
               }
           }
       }
       return b;/**return b**/
   }

}

