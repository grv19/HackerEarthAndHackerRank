import java.math.BigInteger;
import java.util.Scanner;


public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	for(int i=N;i>=1;i--){
		for(int j=1;j<i;j++)
        {
           System.out.print(" ");
        }
        for(int k=N;k>=i;k--)
        {
            System.out.print("#");
        }
        System.out.println();
	}
	
}
}
