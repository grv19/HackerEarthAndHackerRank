import java.util.Scanner;
public class Solution {
    
    public static void insertionSort(int[] A){
    	int count=0;
  for(int i = 1; i < A.length; i++){
    int value = A[i];
    int j = i - 1;
    while(j >= 0 && A[j] > value){
    	//insertion
      A[j + 1] = A[j];
      count++;
      j = j - 1;
    }
    A[j + 1] = value;
  }
        
       System.out.println(count);
}

    
    static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
      }
/* Tail starts here */
public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }    
   }