package studio3;

import java.util.Scanner;

public class Sieve {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("The number of n");
        int n = in.nextInt();
        
        //original array
        int [] markList = new int [n + 1]; // 0, 1 , 2, ... n
        for (int i = 0; i <= n; i++) {
         markList[i] = 0; // 0 means unmarked; 1 means composite number
        }

        for (int i = 2; i <= n; i++) {
         if (markList[i] == 0) {
          System.out.println(i);
         }
         for (int j = i+1; j<=n; j++) {
          if (j % i == 0) {
           markList[j] = 1;  
          }
         }
        }
 }

}
