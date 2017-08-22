/* Problem
	
	Given an integer,n, print its first 10 multiples. 
	Each multiple n*i  (where i >= 1 && i <= 10 ) should 
	be printed on a new line in the form: n x i = result.
	
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
        for(int i=1;i<=10;i++){
            int ans = n*i;         
            System.out.println(n+" "+"x"+" "+i+" "+"="+" "+ans);
        }
    }
}
