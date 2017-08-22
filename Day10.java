/* Problem

	Given a base-10 integer,n,convert it to binary (base-2). 
	Then find and print the base-10 integer denoting the maximum 
	number of consecutive 1's in n's binary representation.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int counter = 0;
        int max = 0;
        int max2=0;
            for(int i=n;i>0;i--){
            count = n%2;
            n=n/2;
           // System.out.println("count:"+" "+count);
           //System.out.println("testcounter"+" "+counter);
            if(count==1){
                counter++;
              //  System.out.println("counter1:"+" "+counter);
            }
                else{
                    max = counter;
                    counter = 0;
                   // System.out.println("max:"+" "+max);
                    //System.out.println("counter0:"+" "+counter);
                }
             if(max2 < max){
                max2 = max;
                counter = 0;
                //System.out.println("max2:"+" "+max2);
        }
      
        }   
        
      
            System.out.println(max2);
        
    }
    
}

