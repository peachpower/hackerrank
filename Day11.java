/* Problem
	Given a 6x6 2D Array, A:
	1 1 1 0 0 0
	0 1 0 0 0 0
	1 1 1 0 0 0
	0 0 0 0 0 0
	0 0 0 0 0 0
	0 0 0 0 0 0

	We define an hourglass in  to be a 
	subset of values with indices falling 
	in this pattern in 's graphical representation:	
	
		a b c
		  d
		e f g
	There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
	Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = 0;
        int max2 = -1;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i<=3;i++){
            for(int j=0;j<=3;j++){
            max = max + arr[i][j] + arr[i][j+1] + arr[i][j+2];
            max = max + arr[i+1][j+1];
            max = max + arr[i+2][j] + arr[i+2][j+1]+arr[i+2][j+2];
         
            
            
        if(max2<max){
            max2 = max;
        }
          max = 0;
          }
        }
        System.out.println(max2);
    }
} 